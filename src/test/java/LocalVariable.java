/*Name: Smita Mokashe
 Batch:AB_37
 Assignment 18: WAP with local variable
 */
package test.java;

public class LocalVariable {
	static void add() {
		int a=20;
		int b=20;
		System.out.println("Addition in method: " +(a+b));
	}
	public static void main(String[] args) {
		System.out.println("Assignment 18: WAP with local variable");
		int a,b,add;    //declaration
		a=20;      //initialization
		b=10;
		add=a+b;
		System.out.println("Addition in main: "+add);
		add();
	}

}
