/* Name: Smita Mokashe
  Batch: AB_37
 Assignment 4: Create many static method and call in inside a main method
 */
package test.java;
public class StaticMethods {
	static int a=200,b=100;
	static void add() {
		System.out.println("Addition");
		System.out.println(a+b);
	}
	
	static void sub() {
		System.out.println("Subtraction");
		System.out.println(a-b);
	}
	static void mul() {
		System.out.println("Multiplication");
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		System.out.println("Assignment 4: Create many static method and call in inside a main method");
		add();
		sub();
		mul();
	}

}
