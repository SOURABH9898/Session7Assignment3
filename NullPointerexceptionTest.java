package com.acadglid.java.core.session7.assignment3;

public class NullPointerexceptionTest {
	
	public static void main(String args[]){
	
		Student s1=new Student();
		s1.name="Sourabh";
		s1.rollNo=56;
		System.out.println("name= "+s1.name+", roll number is "+s1.rollNo+"\n");
		s1=new Student();
	calculateNameLength(s1.name);
		
	}
	static void calculateNameLength(String name){
		try{
		System.out.println(name.length());
	}catch(NullPointerException e){
		System.out.println("the name member of Student object is null ");
	}
	}
}
