package arraysPkg;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		System.out.println("Assignment 64: Create an array of length 3 having String datatype and print it without sorting. Now Sort the array and"
				+ " print its value after sorting");
		int rollno []=new int[3];
		String name []=new String[3];
		
		rollno[0]=95;
		rollno[1]=16;
		rollno[2]=78;
		
		System.out.println("Original rollno: " + Arrays.toString(rollno));
		Arrays.sort(rollno);
		System.out.println("After sorting rollno: " +Arrays.toString(rollno));
		
		name[0]="Smita";
		name[1]="Anvi";
		name[2]="Amol";
		
		System.out.println("Oringinal string names: " +Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After sorting string names: " +Arrays.toString(name));
	}
}
