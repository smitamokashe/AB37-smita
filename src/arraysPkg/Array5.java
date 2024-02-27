package arraysPkg;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		
		int rollno []=new int[5];
		
		for(int i =0;i<=4;i++) {
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the value of index: " +i);
			rollno[i]=sc.nextInt();
		}
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
	}

}
