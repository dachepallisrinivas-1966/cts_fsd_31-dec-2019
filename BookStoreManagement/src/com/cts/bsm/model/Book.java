package com.cts.bsm.model;

import java.io.Serializable;
import java.time.LocalDate;

/*
 * Represents a book in a library or book store.
 */
@SuppressWarnings("serial")
public class Book implements Serializable /* implements Comparable<Book> */ {

	private String bcode;
	private String title;
	private int volume;
	private LocalDate publishDate;
	private Zonar zonar;
	private double price;

	public Book() {
		/* default constructor */
	}

	public Book(String bcode, String title, int volume, LocalDate publishDate,
			Zonar zonar, double price) {
		super();
		this.bcode = bcode;
		this.title = title;
		this.volume = volume;
		this.publishDate = publishDate;
		this.zonar = zonar;
		this.price = price;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public Zonar getZonar() {
		return zonar;
	}

	public void setZonar(Zonar zonar) {
		this.zonar = zonar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bcode=" + bcode + ", title=" + title + ", volume="
				+ volume + ", publishDate=" + publishDate + ", zonar=" + zonar
				+ ", price=" + price + "]";
	}

	/*
	@Override
	public int compareTo(Book book) {
		String firstBCode = this.bcode;
		String secondBCode = book.bcode;
		return firstBCode.compareTo(secondBCode);
	}
		
	@Override
	public int hashCode() {
		int hashCode =0;

		char[] chars = bcode.toCharArray();
		for(int i=1;i<=chars.length;i++){
			hashCode += ((int)chars[i-1])*i;
		}
		
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;

		if (obj instanceof Book) {
			Book book = (Book)obj;
			String firstBCode = this.bcode;
			String secondBCode = book.bcode;
			flag= firstBCode.equals(secondBCode);
		}
		
		return flag;		
	}
*/
}
