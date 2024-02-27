package retutrntypePkg;
import java.util.Scanner;

public class ReturnTypeClass {

	Scanner sc=new Scanner(System.in);
	
	 String name() {
		 String s1;
		 System.out.println("Emter a String: ");
		 s1=sc.next();
		return s1;
	 }
	int add() {
		int a;
		int b;
		System.out.println("Enter value for Addition: ");
		System.out.println("Enter value for A: ");
		a=sc.nextInt();
		System.out.println("Enter value for B: ");
	b=sc.nextInt();
	int sum=a+b;
	System.out.println(sum);
			return sum;
		}
	
	double subtract() {
		int a1;
		double b1;
		System.out.println("Enter value for Subtract: ");
		System.out.println("Enter value for A: ");
		a1=sc.nextInt();
		System.out.println("Enter value for B: ");
		b1=sc.nextDouble();
		double sub=a1-b1;
		System.out.println(sub);
		return sub;
		}
	boolean booleanValue(int a) {
		//System.out.println("Enter value:");
		return true;
	}
	float multiply() {
		int a2;
		float d;
		System.out.println("Enter value for multiply: ");
		System.out.println("Enter value for A: ");
		a2=sc.nextInt();
		System.out.println("Enter value for B: ");
		d=sc.nextFloat();
		float mul=a2*d;
		System.out.println(mul);
		return mul;
	}
	
	public static void main(String[] args) {
		System.out.println("Assignment 106 & 107: WAP for return keyword for int,float , double , string , boolen , using "
				+ "scanner class");
		ReturnTypeClass rt =new ReturnTypeClass();
		rt.name();
		rt.add();
		rt.subtract();
		rt.multiply();
		rt.booleanValue(12);
	}
}