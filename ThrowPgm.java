package exceptionHandling;

import java.util.Scanner;

public class ThrowPgm {

	public static void main(String[] args) {
		System.out.println("Assigment 62: WAP by using throw keyword\r\n"
				+ "if the age of a person is > 18 then allow him to access www.google.com else throw an ArithmeticException");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age =sc.nextInt();
		
		if(age>18) {
			System.out.println("You can access google.com");
		}
		else {
			throw new ArithmeticException ("You can't access google.com");
		}
	}
}