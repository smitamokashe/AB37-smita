package exam;

import java.util.Scanner;

public class AssignmentExam {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("Enter 1st: ");
		a=sc.nextInt();
		
		if(a<=10) {
			System.out.println("number between 10");
		}
		else if(a<=50){
			System.out.println("number between 50");
		}
		else {
			System.out.println("other number");
		}
	}

}
