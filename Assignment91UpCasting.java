package classtypecasting;
class Gradnparent1{
	void grand() {
		System.out.println("Grandparent class method");
	}
}
class Parent1 extends Gradnparent1{
	void parentMethod() {
		System.out.println("parent class method");
	}
}
public class Assignment91UpCasting extends Parent1 {
	void subclass() {
		System.out.println("sub class method");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 91: Upcasting and downcasting Problem 3 as per Diagram during Class");
		Parent1 p11=new Assignment91UpCasting();
		p11.parentMethod();
		p11.grand();
		
		//downcasting
		Assignment91UpCasting as1 = (Assignment91UpCasting) p11;
		as1.grand();
		as1.subclass();
		as1.parentMethod();
		Gradnparent1 gd= new Parent1();
		gd.grand();
		
	}
}