package com.cts.bscp.dao;

import com.cts.bscp.model.Book;
import com.cts.bscp.exception.BookStoreException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BookDAOIOStreamImpl implements IBookDAO {
	public static final String DATA_STORE_FILE_NAME = "bookstore.dat";

	private Map<String, Book> books;

	public BookDAOIOStreamImpl() throws BookStoreException {
		File file = new File(DATA_STORE_FILE_NAME);

		if (!file.exists()) {
			books = new TreeMap<>();
		} else {
			try (ObjectInputStream fin = new ObjectInputStream(
					new FileInputStream(DATA_STORE_FILE_NAME))) {

				Object obj = fin.readObject();

				if (obj instanceof Map) {
					books = (Map<String, Book>) obj;
				} else {
					throw new BookStoreException("Not a valid DataStore");
				}
			} catch (IOException | ClassNotFoundException exp) {
				throw new BookStoreException("Loading Data Failed");
			}
		}
	}

	@Override
	public String add(Book book) throws BookStoreException {
		String bcode = null;
		if (book != null) {
			bcode = book.getBcode();
			books.put(bcode, book);
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone = false;
		if (bcode != null) {
			books.remove(bcode);
			isDone = true;
		}
		return isDone;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		return books.get(bcode);
	}

	@Override
	public List<Book> getAll() throws BookStoreException {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public boolean update(Book book) throws BookStoreException {
		boolean isDone = false;
		if (book != null) {
			String bcode = book.getBcode();
			books.replace(bcode, book);
		}
		return isDone;
	}

	
	public void persist() throws BookStoreException {
		try (ObjectOutputStream fout = new ObjectOutputStream(
				new FileOutputStream(DATA_STORE_FILE_NAME))) {
			fout.writeObject(books);
		} catch (IOException exp) {
			throw new BookStoreException("Saving Data Failed");
		}
	}
}
