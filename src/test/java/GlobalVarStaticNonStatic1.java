/*Name:Smita Mokashe
 Batch:AB_37
 Assignment 21: WAP with 3 methods main,static add and static subtract. Declare and initialize a and b 
 global variables as non- static in nature and then perform addition and subtraction with static methods
 */
package test.java;
public class GlobalVarStaticNonStatic1 {
	int a, b;
	 static void add() {
		 GlobalVarStaticNonStatic1 gc= new GlobalVarStaticNonStatic1();
		 gc.a=200;
		 gc.b=100;
		 System.out.println("Addition");
		 System.out.println(gc.a+gc.b);
		 }
	 static void sub() {
		 GlobalVarStaticNonStatic1 gc= new GlobalVarStaticNonStatic1();
		 gc.a=200;
		 gc.b=100;
		 System.out.println("Subtraction");
		 System.out.println(gc.a-gc.b);
		 }
	public static void main(String[] args) {
		System.out.println("Assignment 21: WAP with 3 methods main,static add and static subtract. Declare "
				+ "and initialize a and b global variables as non- static in nature and then perform addition and "
				+ "subtraction with static methods");
		add();
		sub();

	}

}
