package arraysPkg;
import java.util.Scanner;

public class ArraysScanner1 {

		public static void main(String[] args) {
			
			System.out.println("Assignment63: Create an array of length =5 of int datatype and fetch its value from scanner class.");
			Scanner sc=new Scanner(System.in);
			int n;  										//no of array element
			
			System.out.println("Enter array element to store :  ");
			n=sc.nextInt();
			
			int id [] = new int[n];
			System.out.println("Enter values for array: ");
			
			for(int i=0;i<n;i++) {
				id[i]=sc.nextInt();
			}
			System.out.println("Array elements: ");
			
			for(int i=0;i<n;i++) {
				System.out.println( id[i]);
			}
		}

	}
