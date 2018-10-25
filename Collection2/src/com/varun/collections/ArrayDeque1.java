package com.varun.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> a=new ArrayDeque<String>();
		a.add("varun");
		a.add("aru");
		a.add("anu");	
		a.add("anu");
		a.add("bele");
		
		for(String i:a){
			System.out.println(i);
		}
		System.out.println("Head"+a.peek());
		a.offerFirst("unnu");
		System.out.println("Head"+a.peek());

	}

}
