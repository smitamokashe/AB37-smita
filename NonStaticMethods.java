/*Name: Smita Mokashe
 Batch: AB_37
 Assignment 6: Write many non static method and call it inside the main method
 */
package test.java;
public class NonStaticMethods {
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
		System.out.println(" Assignment 6: Write many non static method and call it inside the main method");
		NonStaticMethods ns=new NonStaticMethods();
		ns.add();
		ns.sub();
		ns.mul();
		ns.div();
	}

}
