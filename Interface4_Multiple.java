package interfacePkg;

interface Drawable{
	void draw();
}
interface Showable{
	void show();
}
interface Printable{
	void print();
}
interface Bank{
	void account();
}

public class Interface4_Multiple implements Drawable,Showable,Printable,Bank {

	public static void main(String[] args) {
		System.out.println("Assignment 50: Create class and 4 interfaces and  class implements 4 interfcaes");
		
		Interface4_Multiple im= new Interface4_Multiple();
		im.draw();
		im.show();
		im.print();
		im.account();
	}
	
	public void account() {
		System.out.println("Account method from Bank Interface");
	}

	public void print() {
		System.out.println("Print method from Printable interface");
	}
	public void show() {
		System.out.println("Show method from Showable interface");
		
	}
	public void draw() {
		System.out.println("Draw method from Drawable interface");
	}

}
