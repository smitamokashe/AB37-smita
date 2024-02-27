package ScannerPkg;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		char c=sc.n
		System.out.println("Enter Value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter Value for b: ");
		int b = sc.nextInt();
		int sum=a+b;
		System.out.println("Sum:  " +sum);*/
		
		/*Scanner sc= new Scanner(System.in);
				System.out.println("Enter age:");
				int age = sc.nextInt();
				System.out.println("Enter gender: M/F");
				char gender;

				if(age >=18  && gender=='Female'){
						System.out.println("You can vote");
				}
				else{
				  System.out.println("Can not vote");
				}*/
		
		/*for(int i=0;i<=-1;i++) {
			System.out.println(i);
		}*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter gender:  M or F");
		

				if(age >=18 ){
					//if(char gender=='f')
					{
						System.out.println("You can vote");
					}
				}
				else{
				  System.out.println("you can not vote");
				}
	}
}
