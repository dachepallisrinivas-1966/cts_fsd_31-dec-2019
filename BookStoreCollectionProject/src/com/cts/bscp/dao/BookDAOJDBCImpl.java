package com.cts.bscp.dao;

import com.cts.bscp.model.Book;
import com.cts.bscp.util.ConnectionProvider;
import com.cts.bscp.exception.BookStoreException;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;

public class BookDAOJDBCImpl implements IBookDAO {

	ConnectionProvider conProvider;
	//Logger log;

	public BookDAOJDBCImpl() throws BookStoreException {
		// log = Logger.getLogger("dao");

		try {
			conProvider = ConnectionProvider.getInstance();
		} catch (ClassNotFoundException | IOException exp) {
			//log.error(exp);
			throw new BookStoreException("Database is not reachable");
		}
	}

	@Override
	public String add(Book book) throws BookStoreException {
		String bcode = null;
		if (book != null) {
			try (Connection con = conProvider.getConnection();
					PreparedStatement pInsert = con
							.prepareStatement(IQueryMapper.ADD_BOOK_QRY)) {

				pInsert.setString(1, book.getBcode());
				pInsert.setString(2, book.getTitle());
				pInsert.setDouble(3, book.getPrice());
				pInsert.setDate(4, Date.valueOf(book.getPublishDate()));

				int rowCount = pInsert.executeUpdate();

				if (rowCount == 1) {
					bcode = book.getBcode();
				}
			} catch (SQLException exp) {
				//log.error(exp);
				throw new BookStoreException("Book is not inserted");
			}
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone = false;

		try (Connection con = conProvider.getConnection();
				PreparedStatement pDelete = con
						.prepareStatement(IQueryMapper.DEL_BOOK_QRY)) {

			pDelete.setString(1, bcode);

			int rowCount = pDelete.executeUpdate();

			if (rowCount == 1) {
				isDone = true;
			}
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BookStoreException("Book is not inserted");
		}

		return isDone;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		Book book=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSelect = con
						.prepareStatement(IQueryMapper.GET_BOOK_QRY)) {

			pSelect.setString(1, bcode);

			ResultSet rs = pSelect.executeQuery();
			
			if(rs.next()){
				book = new Book();
				book.setBcode(rs.getString("bcode"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setPublishDate(rs.getDate("pdate").toLocalDate());
			}
			
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BookStoreException("Book is not available");
		}		
		return book;
	}

	@Override
	public List<Book> getAll() throws BookStoreException {
		List<Book> books=null;
		try (Connection con = conProvider.getConnection();
				PreparedStatement pSelect = con
						.prepareStatement(IQueryMapper.GET_ALL_BOOKS_QRY)) {

			ResultSet rs = pSelect.executeQuery();
			
			books = new ArrayList<Book>();
			
			while(rs.next()){
				Book book = new Book();
				book.setBcode(rs.getString("bcode"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setPublishDate(rs.getDate("pdate").toLocalDate());
				books.add(book);
			}
			
		} catch (SQLException exp) {
			//log.error(exp);
			throw new BookStoreException("No Books are available.");
		}		
		return books;	
	}

	@Override
	public boolean update(Book book) throws BookStoreException {
		boolean isDone = false;
		if (book != null) {
			try (Connection con = conProvider.getConnection();
					PreparedStatement pUpdate = con
							.prepareStatement(IQueryMapper.MODIFY_BOOK_QRY)) {

				
				pUpdate.setString(1, book.getTitle());
				pUpdate.setDouble(2, book.getPrice());
				pUpdate.setDate(3, Date.valueOf(book.getPublishDate()));
				pUpdate.setString(4, book.getBcode());
				

				int rowCount = pUpdate.executeUpdate();

				if (rowCount == 1) {
					isDone = true;
				}
			} catch (SQLException exp) {
				//log.error(exp);
				throw new BookStoreException("Book is not updated.");
			}
		}
		return isDone;
	}

	@Override
	public void persist() throws BookStoreException {
		/* no implementation required */
		
	}
}
