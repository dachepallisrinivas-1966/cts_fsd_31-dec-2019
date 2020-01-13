package com.cts.bsm.dao;

import com.cts.bsm.model.Book;
import com.cts.bsm.exception.BookStoreException;

import java.util.List;

public interface IBookDAO {	
	String add(Book book) throws BookStoreException;
	boolean delete(String bcode)throws BookStoreException;
	Book get(String bcode) throws BookStoreException;;
	List<Book> getAll() throws BookStoreException;;
	boolean update(Book book) throws BookStoreException;
	void persist()throws BookStoreException;
}
