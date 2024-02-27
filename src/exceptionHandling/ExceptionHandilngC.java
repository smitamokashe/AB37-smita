package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandilngC {

	public static void main(String[] args) {
		try {
			System.out.println("Assignment 61: WAP to handle below 2 exceptions by using 2 catch blocks Scanner s1= new Scanner int c = 1/0; int a = s1.nextint();");
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			int c=1/0;
		}
	catch (InputMismatchException ie) {
		
			System.out.println("Input mismatmatch exception");
		}
		
	}
}
