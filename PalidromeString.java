package exceptionHandling;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name=sc.next();
		String output="";
		
		for(int i=name.length()-1;i>=0;i--) {
			char reverse=name.charAt(i);
			output=output+reverse;
		}
		System.out.println(output);
		
		if(name.equals(output)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
