package com.varun.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> a=new PriorityQueue<String>();
		a.add("varun");
		a.add("aru");
		a.add("anu");	
		a.add("anu");
		a.add("bele");
		
		Iterator it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Head: "+a.peek());
		System.out.println();

	}

}
