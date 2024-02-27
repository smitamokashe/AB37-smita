package classtypecasting;
class GreatGrandParent1{
	void verygradparent() {
		System.out.println("Great grand parent method");
	}
}
class GrandParent22 extends GreatGrandParent1{
	void grandparent11() {
		System.out.println("Grand parent method");
	}
}
class Parent22 extends GrandParent22{
	void parent() {
		System.out.println("Parent method method");
	}
}
public class Assignment93UpCasting extends Parent22 {
	void subclass() {
		System.out.println("Sub class method");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 93: Upcasting and downcasting Problem 5 as per Diagram during Class");
		GrandParent22 gs = new Parent22();
		gs.verygradparent();
		gs.grandparent11();
		
		Parent22 pp=new Assignment93UpCasting();
		pp.grandparent11();
		pp.parent();
		pp.verygradparent();
		
		GreatGrandParent1 gg =new GrandParent22();
		gg.verygradparent();
		
		//downcasting
		Parent22 ps=(Parent22) gs;
		gs.grandparent11();
		gs.verygradparent();
		
		Assignment93UpCasting asp =(Assignment93UpCasting) pp;
		asp.grandparent11();
		asp.subclass();
		asp.parent();
		asp.verygradparent();
	}
}
