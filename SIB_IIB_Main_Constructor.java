/*Name: Smita Mokashe
 Batch:AB_37
 Assignment 15: WAP with combination of SIB, IIB, main method, constructor
 */
package test.java;

public class SIB_IIB_Main_Constructor {
	{
		System.out.println("IIB");				//3
	}
	static {
		System.out.println("SIB");				//1
	}
	 public SIB_IIB_Main_Constructor() {
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 15: WAP with combination of SIB, IIB, main method, constructor");
		System.out.println("Main");			//2
		new SIB_IIB_Main_Constructor(); 			//4
	}

}
