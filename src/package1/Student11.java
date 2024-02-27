package package1;

import package2.Teacher11;

public class Student11 extends Teacher11
{

	public static void main(String[] args) 
	{
		System.out.println("Assignment 60: WAP to access 4 different access specifiers outside the package by becoming the subclass");
		
		Student11 s1=new Student11();
		s1.sub();
		s1.add();
	}

}
