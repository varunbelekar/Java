package com.varun.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Book11{
	String bookName;
	String authorName;
	int price;
	public Book11(String bookName, String authorName, int price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book11 [bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
	}
	
}

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs=new HashSet();
		hs.add("eur");
		hs.add("usd");
		hs.add("sve");
		
		Map<String,Integer> a=new HashMap<String,Integer>();
		
		for(String s:hs){
			a.put(s, 0);
		}
	
		for(Map.Entry<String,Integer> i:a.entrySet()){
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		int tv[]={80,20,100,100,30,10};
		String currCode[]={"eur","sve","eur","sve","usd","usd"};
		
		
		System.out.println("hi");
		for(int i=0;i<tv.length;i++){
			String s=currCode[i];
			int val=tv[i];
			//System.out.println("value="+val);
			a.put(s, (a.get(s)+val));
			//System.out.println(a.get(s));
			
		}
		System.out.println("hi");
		
		for(Map.Entry<String,Integer> i:a.entrySet()){
			System.out.println("Total "+i.getKey()+" "+i.getValue());
		}
		
	}

}
