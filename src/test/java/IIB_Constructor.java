/*Name:Smita Mokashe
 Batch:AB_37
 Assignment 16:WAP with 4 IIBs and 1 constructor
 */
package test.java;
public class IIB_Constructor {
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
	{
		System.out.println("IIB 4");
	}
	
	IIB_Constructor(){													//Constructor
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 16:WAP with 4 IIBs and 1 constructor");
		System.out.println("Main");
		new IIB_Constructor();
	}

}
