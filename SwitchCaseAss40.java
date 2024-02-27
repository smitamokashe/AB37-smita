package SwitchCases;
import java.util.Scanner;
public class SwitchCaseAss40 {

	public static void main(String[] args) {
		System.out.println("Assignment 40: WAP a program using Switch(3) keyword case1:addition, case2:subtraction,"
				+ "case3:multiplication, case4:division and break at case(3).");

		Scanner sc = new Scanner(System.in);
		int a,b,result=0;
		System.out.println("Enter value for A: ");
		a= sc.nextInt();
		System.out.println("Enter value for B: ");
		b=sc.nextInt();
		
		switch(3) {
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
		default:
			System.out.println("Please enter valid input");
		}
 }
}
