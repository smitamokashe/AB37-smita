/*Name:Smita Mokashe
 Batch:AB_37
 Assignment 17: WAP with 4 constructors and 1 IIB
 */
package test.java;
public class Constructor_IIB_Combo {
	Constructor_IIB_Combo(){
		System.out.println("Constructor 1");
	}
	Constructor_IIB_Combo(int a){
		System.out.println("Constructor 2");
	}
	Constructor_IIB_Combo(String str){
		System.out.println("Constructor 3");
	}
	Constructor_IIB_Combo(char c){
		System.out.println("Constructor 4");
	}
	
	{
		System.out.println("I am IIB");
	}

	public static void main(String[] args) {
		System.out.println("Assignment 17: WAP with 4 constructors and 1 IIB");
		System.out.println("I am Main");
		new Constructor_IIB_Combo();
		new Constructor_IIB_Combo(10);
		new Constructor_IIB_Combo("anvi");
		new Constructor_IIB_Combo('a');
		
		System.out.println("Execution:-> 1. Main, 2.IIB, 3.Constructor1-IIB, Constructor2-IIB, Constructor3-IIB, Constructor4");
	}

}
