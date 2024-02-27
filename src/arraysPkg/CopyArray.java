package arraysPkg;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		System.out.println("Assignment 65: Create an array of length 4 & copy its value to another array using iteration");
	
		int rollno[]=new int[4];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=3;
		rollno[3]=4;
		
		int copyroll[]=new int[4];
		
		for(int i=0;i<4;i++){
				copyroll[i]=rollno[i];
	}
	System.out.println("Original array: " +Arrays.toString(rollno));
	System.out.println("Copied array: " +Arrays.toString(copyroll));
	}
}
