package SwitchCases;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,result=0;
		char operation;
		System.out.println("Choose an operator: For Add '+', For Sub '-', For Mul '*', For Div '/'");
	    operation = sc.next().charAt(0);
		System.out.println("Enter value for A: ");
		a= sc.nextInt();
		System.out.println("Enter value for B: ");
		b=sc.nextInt();
		
		switch(operation) {
		
		case '+':
			result=a+b;
			System.out.println("Addition: " +result);
		
		case '-':
			result=a-b;
			System.out.println("Subtraction: " +result);
			
		case '*':
			result=a*b;
			System.out.println("Multiplication: " +result);
			break;
			
		case '/':
			result=a/b;
			System.out.println("Division: " +result);
			break;
			
		default:
			System.out.println("Please enter valid input");
		}

	}

}