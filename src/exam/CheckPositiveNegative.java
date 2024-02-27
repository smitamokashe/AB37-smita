package exam;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive number");
		}
		else if(num<0){
			System.out.println("Negative number");
		}
		else {
			System.out.println("Number is zero");
		}
	}

}
