package com.cts.bsm.ui;

import com.cts.bsm.model.Book;
import com.cts.bsm.model.BookStoreAppMenu;
import com.cts.bsm.model.Zonar;
import com.cts.bsm.exception.BookStoreException;
import com.cts.bsm.service.BookServiceImpl;
import com.cts.bsm.service.IBookService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookStoreManagementUI {

	private static IBookService bookService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormater;

	public static void main(String[] args) {

		try {
			bookService = new BookServiceImpl();
		} catch (BookStoreException e) {
			e.printStackTrace();
		}


		scan = new Scanner(System.in);
		dtFormater = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		BookStoreAppMenu menu = null;

		while (menu != BookStoreAppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (BookStoreAppMenu m : BookStoreAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Pleae choose a choice displayed");
				continue;
			}

			if (choice < 0 || choice >= BookStoreAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = BookStoreAppMenu.values()[choice];
				switch (menu) {
				case ADD:
					doAdd();
					break;
				case LIST:
					doList();
					break;
				case SEARCH:
					doSearch();
					break;
				case REMOVE:
					doRemove();
					break;
				case QUIT:
					System.out.println("ThanQ Come Again!");
					break;
				}
			}

		}

		scan.close();
		try {
			bookService.persist();
		} catch (BookStoreException e) {
			e.printStackTrace();
		}

	}

	private static void doAdd() {
		try {
			Book book = new Book();
			System.out.print("BCode: ");
			book.setBcode(scan.next());
			System.out.print("Title: ");
			book.setTitle(scan.next());
			System.out.print("Volume: ");
			if (scan.hasNextInt())
				book.setVolume(scan.nextInt());
			else {
				scan.next();
				throw new BookStoreException(
						"Volumn is a non-fractional number");
			}

			System.out.print("PublishDate(dd-MM-yyyy): ");
			String pubDtStr = scan.next();

			try {
				book.setPublishDate(LocalDate.parse(pubDtStr, dtFormater));
			} catch (DateTimeException exp) {
				throw new BookStoreException(
						"Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			System.out.print("Price: ");
			if (scan.hasNextDouble())
				book.setPrice(scan.nextDouble());
			else {
				scan.next();
				throw new BookStoreException("Price is a number");
			}
			String zonarValStr = Arrays.toString(Zonar.values());
			StringBuilder sb = new StringBuilder(zonarValStr);
			sb.deleteCharAt(0);
			sb.deleteCharAt(sb.length() - 1);
			zonarValStr = sb.toString();
			zonarValStr = zonarValStr.replace(", ", "|");
			System.out.print("Zonar " + zonarValStr + " : ");
			String zonarStr = scan.next();
			Pattern zonarPattern = Pattern.compile(zonarValStr);
			Matcher zonarMatcher = zonarPattern.matcher(zonarStr);
			if (zonarMatcher.matches())
				book.setZonar(Zonar.valueOf(zonarStr.toUpperCase()));
			else
				throw new BookStoreException(
						"Choose a zonar from given values only");

			String bcode = bookService.add(book);
			System.out.println("Book is Added with code: " + bcode);
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doList() {
		List<Book> books;
		try {
			books = bookService.getAll();
			if (books.size() == 0) {
				System.out.println("No Books To display");
			} else {
				for (Book b : books)
					System.out.println(b);
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doSearch() {
		System.out.print("BCode: ");
		String bcode = scan.next();

		try {
			Book book = bookService.get(bcode);
			if (book != null) {
				System.out.println(book);
			} else {
				System.out.println("No Such Book");
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doRemove() {
		System.out.print("BCode: ");
		String bcode = scan.next();
		try {
			boolean isDone = bookService.delete(bcode);
			if (isDone) {
				System.out.println("Book is Deleted");
			} else {
				System.out.println("No Such Book");
			}
		} catch (BookStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}
}
