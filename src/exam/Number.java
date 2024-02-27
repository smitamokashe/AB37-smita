package exam;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.println("1st number: ");
		int num1=in.nextInt();
		
		System.out.println("2nd number: ");
		int num2=in.nextInt();
		
		System.out.println("3rd number: ");
		int num3=in.nextInt();
		
		if(num1>num2) { 
			if(num1>num3) {
				System.out.println("Greatest nym: "+num1);
			}
		}
		if(num2>num1) { 
			if(num2>num3) {
				System.out.println("Greatest nym: "+num2);
			}
		}
		if(num3>num1) { 
			if(num3>num2) {
				System.out.println("Greatest nym: "+num3);
			}
		}
	}

}
