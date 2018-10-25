package com.varun.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Student1 arg){
		return this.name.compareTo(arg.name);
	
	}
	
}

public class Comparable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> l=new ArrayList<Student1>();
		l.add(new Student1(1,"varun"));
		l.add(new Student1(2,"anu"));
		l.add(new Student1(3,"web"));
		l.add(new Student1(4,"aru"));
		l.add(new Student1(5,"zen"));
		Collections.sort(l);
		for(Student1 st:l){
			System.out.println(st.id+" "+st.name);
		}
	}
	
	
	
}
