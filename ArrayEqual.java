package arrayStringAssignments;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		System.out.println("Assignment 77 & 78: WAP to check if 2 arrays are equals to each other for String data type");
		String name [] = {"Smita","Anvi","Laddu","Shreeya"};
		String name1 [] = {"Smita","Anvi","Laddu","Shreeya"};
		System.out.println("Arrays of string datatype: " +Arrays.equals(name,name1));
		
		int num [] = {1,2,3,4,5};
		int num1 []=  {1,2,3,4,5};
		System.out.println("Arrays of int datatype: "+Arrays.equals(num, num1));
	}
}
