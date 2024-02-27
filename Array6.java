package arraysPkg;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		boolean answer []=new boolean[3];
		
		for(int i =0;i<2;i++) {
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the value of index: " +i);
			answer[i]=sc.nextBoolean();
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

}
