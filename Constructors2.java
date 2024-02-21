/* Name: Smita Mokashe
 * Batch: AB_37
 Assignment 8: Create few constructor and call it in main method
 */
package test.java;

public class Constructors2 {
	Constructors2() {
		System.out.println("Constructor 1 with no arguments");
	}
	Constructors2(String str){
		System.out.println(str);
	}
	Constructors2(String str1, String str2){
		System.out.println(str1 + str2);
	}

	public static void main(String[] args) {
		System.out.println("Assignment 8: Create few constructor and call it in main method");
		new Constructors2();
		new Constructors2("Constructor 2 with 1 parameter");
		new Constructors2("Constructor 3 " +"with 2 parameters");
}

}
