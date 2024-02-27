package inheritanceAssignment;

class Three
{
	void add() {
		System.out.println("Addition using scanner class");
	}
}

class Two extends Three{
	void subtract() {
		System.out.println("Subtract using scanner class");
	}
}
public class One extends Two {
		void multiply() {
		System.out.println("Multiply using scanner class");
	}

	public static void main(String[] args) {
		System.out.println("Assignment 45: WAP for multilevel inheritance in a single program and make all"
				+ " the methods are non static");
		
		One o = new One();
		o.multiply();
		o.add();
		o.subtract();
	}

}
