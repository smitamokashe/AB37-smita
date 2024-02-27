/*Name: Smita Mokashe
Batch: AB_37
Assignment 10: WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. 
Multiply and divide in last two and call in main method.
 */
package test.java;
public class StaticNonStaticCombo {
	static void add() {
		int a = 20,b=100;
		System.out.println("Addition: "+(a+b));
	}
	static void sub() {
		int a = 200,b=100;
		System.out.println("Subtraction: "+(a-b));
	}
	void mul() {
		int a = 20,b=100;
		System.out.println("Multiplication: "+(a*b));
	}
	void div()
	{
		int a = 200,b=2;
		System.out.println("Division: "+(a/b));
	}
		public static void main(String[] args) {
		System.out.println("Assignment 10: WAP to create a Class with 2 static and 2 non static methods, "
				+ "perform add and sub in first two.Multiply and divide in last two and call in main method.");
		add();													//Staticmethod call
		sub();
		StaticNonStaticCombo ns = new StaticNonStaticCombo();
		ns.mul();												//Non static call
		ns.div();
	}

}
