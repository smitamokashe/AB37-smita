package ScannerPkg;
import java.util.Scanner;
public class MethodsOfScanner {

	public static void main(String[] args) {
		System.out.println("Assignment 34: WAP by using Using all the methods of scanner class");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for NextInt: ");
		int a = sc.nextInt();
		System.out.println("nextInt: " + a);
		
		System.out.println("Enter value for NextByte: ");
		byte b = sc.nextByte();
		System.out.println("nextByte: " + b);
		
		System.out.println("Enter value for NextShort: ");
		short s = sc.nextShort();
		System.out.println("nextShort: " + s);
		
		System.out.println("Enter value for NextLong: ");
		long l = sc.nextLong();
		System.out.println("nextLong: " + l);
		
		System.out.println("Enter value for NextFloat: ");
		float f = sc.nextFloat();
		System.out.println("nextFloat: " + f);
		
		System.out.println("Enter value for NextDouble: ");
		double d= sc.nextDouble();
		System.out.println("nextDouble: " + d);
		
		System.out.println("Enter value for NextBoolean: ");
		boolean b1 = sc.nextBoolean();
		System.out.println("nextBoolean: " + b1);
		
		System.out.println("Enter value for Next: ");
		String s1 = sc.next();
		System.out.println("next: " + s1);
		}
}
