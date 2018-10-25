package com.varun.collections;

import java.util.LinkedList;
import java.util.List;

class Book{
	String bookName;
	String author;
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
}
public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book("wings of fire","apj abdul kalam");
		Book b2=new Book("Harrypotter","J.k Rowling");
		List<Book>al=new LinkedList<Book>();
		al.add(b1);
		al.add(b2);
		for(Book b:al){
			System.out.println(b.bookName+" "+b.author);
		}
	}

}
