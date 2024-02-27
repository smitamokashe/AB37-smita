package SwitchCases;
import java.util.Scanner;
public class SwitchCase41 {

	public static void main(String[] args) {
		System.out.println("Assignment 41: WAP a program using Switch(a) keyword case1: addition, case2:subtraction, "
				+ "case3:multiplication, case4 And fetch the value of 'a' with scanner class using next int() method.");
		
		Scanner sc = new Scanner(System.in);
		int a,b,result=0;
		int c;
		System.out.println("Choose any integer: ");
	    c=sc.nextInt();
		System.out.println("Enter value for A: ");
		a= sc.nextInt();
		System.out.println("Enter value for B: ");
		b=sc.nextInt();	
		switch(c) {
		case 1:
			result=a+b;
			System.out.println("Addition: " +result);
		case 2:
			result=a-b;
			System.out.println("Subtraction: " +result);
		case 3:
			result=a*b;
			System.out.println("Multiplication: " +result);
			break;
		case 4:
			result=a/b;
			System.out.println("Division: " +result);
			break;
		default:
			System.out.println("Please enter valid input");
		}
}

}
