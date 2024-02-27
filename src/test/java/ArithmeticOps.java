/*Name: Smita Mokashe
 Batch: AB_37
 Assignment 9: WAP to perform Subtraction, Multiplication and Division of 2 numbers.
 */
package test.java;
public class ArithmeticOps {
	void add() {
		int a=10,b=20;
		System.out.println("Additon: "+(a+b));
	}
	void sub() {
		int a=100,b=20;
		System.out.println("Subtraction: "+(a-b));
	}
	void mul() {
		int a=100,b=20;
		System.out.println("Multiplication: "+(a*b));
	}
	void div() {
		int a=100,b=20;
		System.out.println("Division: "+(a/b));
	}

	public static void main(String[] args) {
		System.out.println("Assignment 9: WAP to perform Subtraction, Multiplication and Division of 2 numbers.");
		ArithmeticOps as=new ArithmeticOps();
		as.add();
		as.sub();
		as.mul();
		as.div();
	}

}
