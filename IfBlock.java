/*Name: Smita Mokashe
 *Batch AB_37
 Assignment 12:  WAP to perform 6 if blocks using all conditional Operators. 
 */
package test.java;

public class IfBlock {

	public static void main(String[] args) {
		System.out.println("Assignment 12:  WAP to perform 6 if blocks using all conditional Operators. ");
		int a,b;
		a=5;
		b=6;
		
		if(a>b) {																				//false
			System.out.println("Condition False,it will not execute");
	}
		if(a<b) {																				//true
			System.out.println("Condition true, it will execute");
		}
		if(a>=b) {																					//either can be true > or =
			System.out.println("Condition False,it will not execute");
		}
		if(a<=b) {																						//true
			System.out.println("Condition true, it will execute");
		}
		if(a==b) {																						//false
			System.out.println("Condition False,it will not execute");
		}
		if(a!=b) {																						//true
			System.out.println("Condition true, it will execute");
		}
	}
}
