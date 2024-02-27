package exam;

import java.util.Scanner;

public class ageFinder {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter Age Of a Person: ");
		age=sc.nextInt();
		
		if(age>50) {
			System.out.println("Smita");
		}
		else {
			System.out.println("Shahrukh Khan");
		}
	}
}
