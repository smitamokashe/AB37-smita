package classtypecasting;
class GreatGrandParent{
	void verygradparent() {
		System.out.println("Great grand parent method");
	}
}
class GrandParent12 extends GreatGrandParent{
	void grandparent11() {
		System.out.println("Grand parent method");
	}
}
class Parent12 extends GrandParent12{
	void parent() {
		System.out.println("Parent method method");
	}
}
public class Assignment92UpCasting  extends Parent12{
	void subclass() {
		System.out.println("Sub class method");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 92: Upcasting and downcasting Problem 4 as per Diagram during Class");
		GrandParent12 gd = new Parent12();
		gd.grandparent11();
		gd.verygradparent();
		//downcasting
		Parent12 p1=(Parent12) gd;
		p1.grandparent11();
		p1.verygradparent();
		p1.parent();
		
		
		/*Parent12 ps=new Assignment92UpCasting();
		ps.verygradparent();
		ps.grandparent11();
		ps.parent();*/
		
		/*GreatGrandParent gg= new GrandParent12();
		gg.verygradparent();*/
	}
}
