package bookfinder.controller;
import bookfinder.view.ViewBooks;
import java.util.Scanner;

import bookfinder.model.Books;

public class BookRegistration {
	
	static Scanner input=new Scanner(System.in);
	
	public void addBooks() {
		System.out.println();
		System.out.println("Enter Book name ");
		String bookname=input.nextLine();
		Books bookpojo=new Books();
		bookpojo.setBookName(bookname);
		bookpojo.setBookIndex(bookname.charAt(0));
		Books.booklist.add(bookpojo);
		System.out.println();
		
	}
	public void removeBooks() {
		System.out.println();
		new ViewBooks().viewbook();
		System.out.println("Enter your book name to be removed ");
		String removeBook=input.nextLine();
		for(int i=0;i<Books.booklist.size();i++) {
			if(Books.booklist.get(i).getBookName().equals(removeBook)) {
				Books.booklist.remove(i);
				System.out.println("The book "+ removeBook + " is Removed Successfully");
				break;
			}
		}
		new ViewBooks().viewbook();
		System.out.println();
	}
	
	public void searchBooks() {
		
	}

	

}
