package abstractMethods;

abstract class Abstact_Class{
	abstract void multiply();
	abstract void division();		
}
public class Abstract_concret extends Abstact_Class{
	static void add() {
		int a=5,b=5;
		System.out.println("Addition:" +(a+b));
	}
	void subtract() {
		int a=15,b=5;
		System.out.println("Subtraction:" +(a-b));
	}

	public static void main(String[] args) {
		System.out.println("Assignment 48: create a class and create two concrete methods inside a class"
				+ "(static add, non static sub), create abstract class and create two abstract mthods (multiplication, divison),"
				+ " create two concrete methods inside main method ");
	
		Abstract_concret ac = new Abstract_concret();
		ac.subtract();
		add();
		ac.multiply();
		ac.division();
	}
	void multiply() {
		int a=15,b=5;
		System.out.println("Multiplication:" +(a*b));	
	}
	void division() {
		int a=15,b=5;
		System.out.println("Division:" +(a/b));
	}

}
