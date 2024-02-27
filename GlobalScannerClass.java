package ScannerPkg;
import java.util.Scanner;

public class GlobalScannerClass {
	 Scanner sc=new Scanner(System.in);
	 int a,b,result;
	 
	void add() 
	{
		System.out.println("Addition");
		System.out.println("Enter value for A: ");
		a = sc.nextInt();
		System.out.println("Enter value for B: ");
		b= sc.nextInt();
		result = a+b;
		System.out.println("Addition: " +result);
	}
	
	void sub() 
	{
		System.out.println("Subtraction");
		System.out.println("Enter value for A: ");
		a = sc.nextInt();
		System.out.println("Enter value for B: ");
		b= sc.nextInt();
		result = a-b;
		System.out.println("Subtraction: " +result);
	}
	
	void mul() 
	{
		System.out.println("Multiplication");
		System.out.println("Enter value for A: ");
		a = sc.nextInt();
		System.out.println("Enter value for B: ");
		b= sc.nextInt();
		result = a*b;
		System.out.println("Multiplication: " +result);
	}
	
	void div() 
	{
		System.out.println("Division");
		System.out.println("Enter value for A: ");
		a = sc.nextInt();
		System.out.println("Enter value for B: ");
		b= sc.nextInt();
		result = a/b;
		System.out.println("Division: " +result);
	}

	public static void main(String[] args) {
		
		System.out.println("Assignment 37:=WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables");
		GlobalScannerClass gc= new GlobalScannerClass();
		gc.add();
		gc.sub();
		gc.mul();
		gc.div();
	}

}
