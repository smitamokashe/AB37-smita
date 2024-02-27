package ScannerPkg;
import java.util.Scanner;
public class ScannerWithArithmetic {

	static void add() 
	{
		System.out.println("Addition");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter value for B: ");
		int b= sc.nextInt();
		int sum = a+b;
		System.out.println("Addition: " +sum);
	}
	static void sub() 
	{
		System.out.println("Subtraction");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter value for B: ");
		int b= sc.nextInt();
		int sub = a-b;
		System.out.println("Subtraction: " +sub);
	}
	static void mul() 
	{
		System.out.println("Multiplication");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter value for B: ");
		int b= sc.nextInt();
		int multi = a*b;
		System.out.println("Multiplication: " +multi);
	}
	
	static void div() 
	{
		System.out.println("Division");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A: ");
		int a = sc.nextInt();
		System.out.println("Enter value for B: ");
		int b= sc.nextInt();
		int divi = a/b;
		System.out.println("Division: " +divi);
	}
	
	public static void main(String[] args) {
		System.out.println("Assignment36: WAP to do addition, subtraction,multiplication, division by using scanner class"
				+ " and  a and b as local variables");
		add();
		sub();
		mul();
		div();
	}
}