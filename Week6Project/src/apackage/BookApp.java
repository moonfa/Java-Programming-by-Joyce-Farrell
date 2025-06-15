package apackage;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {5,78,90,12};
		int element = 90;
		boolean found = false;
		for(int i=0;i<values.length && !found;i++) {
			if(element == values[i]) {
				System.out.println("element found at indext " + i);
				//i = values.length;
				found = true;
			}
	
		}
			
		
		Book[] books = new Book[2];
		Scanner input = new Scanner(System.in);
		int id;
		String title;
		for(int i=0;i<books.length;i++) {
			System.out.println("Enter book id");
			id = input.nextInt();
			System.out.println("Enter book title");
			input.nextLine();
			title = input.nextLine();
			Book bookObj = new Book(id,title);
			books[i] = bookObj;
		}
		System.out.println("Book's information");
		for(Book b : books) {
			System.out.println(b);
			System.out.println(b.getVersion(0));
		}
		
	}

}






