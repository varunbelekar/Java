package com.varun.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	 int age;
	 String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}

public class ArrayList2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(21,"varun");
		Student s2=new Student(21,"aru");
		List<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.name+" "+s.age);
		}
		System.out.println("hello");
	}
}
