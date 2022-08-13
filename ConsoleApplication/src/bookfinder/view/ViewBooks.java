package bookfinder.view;

import bookfinder.model.Books;

public class ViewBooks {
	public void viewbook() {
		for(Books book:Books.booklist) {
			System.out.println();
			System.out.println("Book name is "+book.getBookName());
			System.out.println("Book index is "+ book.getBookIndex());
			System.out.println();
		}
	}

}
