package interfacePkg;

 interface Drawing{
	void draw();
}
interface Showing extends Drawing{
	void show();
}
interface Printable1 extends Showing{
	void print();
}

public class Interface3Class  implements Printable{

	public static void main(String[] args) {
		System.out.println("Assignment 52:create class and 3 interfaces. class implements interface3 and interface3 extends interface2 "
				+ "interface2 extends interface1");
		Interface3Class ic=new Interface3Class();
		ic.draw();
		ic.print();
		ic.show();
	}
	public void show() {
		System.out.println("Showing  interface : show method");
	}
	public void draw() {
		System.out.println("Drawing interface: draw method");
	}
	public void print() {
		System.out.println("Printable interface: print method");
	}

}
