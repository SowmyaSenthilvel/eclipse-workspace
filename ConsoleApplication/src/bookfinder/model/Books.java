package bookfinder.model;

import java.util.ArrayList;

public class Books {
	private char bookIndex;
	private String bookName;
	
	public static ArrayList<Books> booklist=new ArrayList<Books>();
	
	public char getBookIndex() {
		return bookIndex;
	}
	public void setBookIndex(char bookIndex) {
		this.bookIndex = bookIndex;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	

}
