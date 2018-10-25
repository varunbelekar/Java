package com.varun.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> a=new TreeSet<String>();
		a.add("varun");
		a.add("roshan");
		a.add("roshan");
		a.add("vinita");
		Iterator it=a.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
