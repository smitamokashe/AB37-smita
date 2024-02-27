/*Name:SmitaMokashe
 Batch:AB_37
 Assignment 20: WAP with 3 methods main,static add and static subtract. Declare a and b as static 
 global variables and initialize then in each method and perform addition and subtraction
 */
package test.java;
public class GlobalVarStaticNonStatic {
	static int a,b;
	static void add() {
		a=10;
		b=20;
		System.out.println("Addition");
		System.out.println(a+b);
	}	
	static void sub() {
		a=20;
		b=10;
		System.out.println("Subtraction");
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		System.out.println("Assignment 20: WAP with 3 methods main,static add and static subtract."
				+ " Declare a and b as static  global variables and initialize then in each method and perform "
				+ "addition and subtraction");
		add();
		sub();
	}
}
