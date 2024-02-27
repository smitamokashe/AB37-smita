package inheritanceAssignment;
class Parent{
	void add() {
		System.out.println("Parent class Add method");
	}
}
class Daughter extends Parent{
	void subtract() {
		System.out.println("Daughter class Subtract method");
	    super.add();
	}
}
public class Son extends Parent{
	void multiply() {
		System.out.println("Son class multiply method");
	}
	public static void main(String[] args) {
		 System.out.println("Assignment 46: write a program for hierarchical inheritance and create a three classes"
		 		+ "(son, daughter, parent) in a single program");
		 
		 Son s=new Son();
		 s.add();			//parent class method for son class
		 s.multiply();
		 
		 Daughter d=new Daughter();
		 d.subtract();
		 //d.add();	//parent class method for daughter class
	}

}
