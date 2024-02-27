package ScannerPkg;

import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[]args) {
		
		System.out.println("Assignment 38: WAP to find area of triangle by taking values of b and h from scanner class");
		
		System.out.println("Area Of Triangle");
		
		Scanner sc=new Scanner(System.in);
		int b,h,areaOfTraingle;
		System.out.println("Enter value for b: ");
		b=sc.nextInt();
		System.out.println("Enter value for h: ");
		h=sc.nextInt();
		areaOfTraingle= (b*h)/2;
		System.out.println("Area of triangle: " +areaOfTraingle);
		
	}

}
