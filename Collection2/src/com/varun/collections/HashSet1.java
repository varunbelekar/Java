package com.varun.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> al=new HashSet<String>();
		al.add("aru");
		al.add("varun");
		al.add("anu");
		al.add("aru");
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
