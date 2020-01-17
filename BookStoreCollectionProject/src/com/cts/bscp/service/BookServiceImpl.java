package com.cts.bscp.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cts.bscp.dao.BookDAOIOStreamImpl;
import com.cts.bscp.dao.BookDAOJDBCImpl;
import com.cts.bscp.dao.IBookDAO;
import com.cts.bscp.exception.BookStoreException;
import com.cts.bscp.model.Book;

public class BookServiceImpl implements IBookService {
	
	private IBookDAO bookDao;

	public IBookDAO getDAO(){
		return bookDao;
	}
	
	public BookServiceImpl() throws BookStoreException {
		// bookDao = new BookDAOCollectionImpl();
		// bookDao = new BookDAOIOStreamImpl();
		bookDao = new BookDAOJDBCImpl();
		
	}
	
	public boolean isValidBcode(String bcode){
		
		/*
		 * First letter must be capital
		 * Followed by three digits
		 */
		Pattern bcodePattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher bcodeMatcher = bcodePattern.matcher(bcode);
		
		return bcodeMatcher.matches();
	}
	
	public boolean isValidTitle(String title){
		/*
		 * First Letter should be capital
		 * Minimum length is 4 chars
		 * Maximum length is 20 chars.		
		 */
		Pattern titlePattern = Pattern.compile("[A-Z]\\w{3,19}");
		Matcher titleMatcher = titlePattern.matcher(title);
		
		return titleMatcher.matches();
	}
	
	public boolean isValidPrice(double price){
		/*
		 * Price is between 5 and 5000
		 */
		return price>=5 && price<=5000;
	}
	
	public boolean isValidPublishDate(LocalDate publishDate){
		/*
		 * publish date should not be greater than the current day.
		 */
		LocalDate today = LocalDate.now();
		//return publishDate.isBefore(today) || publishDate.equals(today);
		return today.isAfter(publishDate) || publishDate.equals(today);
	}
	
	public boolean isValidBook(Book book) throws BookStoreException{
		boolean isValid=false;
		
		List<String> errMsgs = new ArrayList<>();
		
		if(!isValidBcode(book.getBcode()))
			errMsgs.add("bcode should start with a capital alphabet followed by 3 digits");
		
		if(!isValidTitle(book.getTitle()))
			errMsgs.add("Title must start with capital and must be in between 4 to 20 chars in length");
		
		if(!isValidPrice(book.getPrice()))
			errMsgs.add("Price must be between INR.5 and INR.5000");
		
		if(!isValidPublishDate(book.getPublishDate()))
			errMsgs.add("Publish Date should not be a future date");
		
		if(errMsgs.size()==0)
			isValid=true;
		else
			throw new BookStoreException(errMsgs.toString());
		
		return isValid;
	}


	@Override
	public String add(Book book) throws BookStoreException {
		String bcode=null;
		if(book!=null && isValidBook(book)){
			bcode=bookDao.add(book);
		}
		return bcode;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDone=false;
		if(bcode!=null && isValidBcode(bcode)){
			bookDao.delete(bcode);
			isDone = true;
		}else{
			throw new BookStoreException("bcode should be a capital letter followed by 3 digits");
		}
		return isDone;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		return bookDao.get(bcode);
	}

	@Override
	public List<Book> getAll() throws BookStoreException {
		return bookDao.getAll();
	}

	@Override
	public boolean update(Book book) throws BookStoreException {
		boolean isDone = false;
		
		if(book!=null && isValidBook(book)){
			isDone = bookDao.update(book);
		}
		
		return isDone;
	}


	@Override
	public void persist() throws BookStoreException {
		bookDao.persist();
	}
}
