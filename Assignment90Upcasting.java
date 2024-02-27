package classtypecasting;
class Gradnparent{
	void grand() {
		System.out.println("Grandparent class method");
	}
}
class Parent extends Gradnparent{
	void parentMethod() {
		System.out.println("parent class method");
	}
}

public class Assignment90Upcasting extends Parent {
	void subclass() {
		System.out.println("sub class method");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 90: Upcasting and downcasting Problem 2 as per Diagram during Class");
		//upcasting
		Gradnparent gp=new Assignment90Upcasting();									//grandparent to parent
		gp.grand();
		
		//downcasting
		Assignment90Upcasting ass =(Assignment90Upcasting) gp;
		ass.grand();
		ass.parentMethod();
		ass.subclass();
		
		/*Parent p=new Assignment90Upcasting();			//parent object to subclass
		p.grand();
		p.parentMethod();*/
		
		/*Assignment90Upcasting as= (Assignment90Upcasting) new Parent();
		as.parentMethod();
		as.grand();
		as.subclass();*/
	}
}
