/*Name: Smita Mokashe
 *Batch: AB_37
 Assignment 5: Write a non static method and call it inside the main method
 */
package test.java;

public class NonStaticMethod {

	void add() {
		int a=10,b=20;
		System.out.println("Addition: " +(a+b));
	}
	public static void main(String[] args) {
		System.out.println("Assignment 5: Write a non static method and call it inside the main method");
		NonStaticMethod ns = new NonStaticMethod();
		ns.add();	

	}

}
