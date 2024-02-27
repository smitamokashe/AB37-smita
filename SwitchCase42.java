package SwitchCases;

import java.util.Scanner;

public class SwitchCase42 {

	public static void main(String[] args) {
		System.out.println("Assignment 42: WAP using switch(a) keyword case1: addition of b&c, case2: subtraction "
				+ "of b&c, case3: multiplication of b&C, case4: division of b&c. Fetch the value of a, b &c from scanner class "
				+ "using nextint() method. And print the output individually for all cases.");
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,result=0;
		System.out.println("Choose any integer from 1-4 for operation: (1 for Add 2 for sub 3 for mul 4for div )");
	    a=sc.nextInt();
		System.out.println("Enter value for A: ");
		b= sc.nextInt();
		System.out.println("Enter value for B: ");
		c=sc.nextInt();	
		switch(a) {
		
		case 1:
			result=b+c;
			System.out.println("Addition: " +result);
			break;
			
		case 2:
			result=b-c;
			System.out.println("Subtrqction: " +result);
			break;
			
		case 3:
			result=b*c;
			System.out.println("Multiplication: " +result);
			break;
			
		case 4:
			result=b/c;
			System.out.println("Division: " +result);
			break;
			
			default:
				System.out.println("Enter valid input");
	}	
}
	
}