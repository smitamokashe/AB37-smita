/*Name:Smita Mokashe
 Batch: AB_37
 Assignment 30: WAP to   calculate the area of circle.(pi value should be final static local variable and initialise).
 */
package test.java;
public class AreaOfCircle {
	
	static final double pi=3.14;
	
	static void AreaOfCircle1() {
		double  r=7;
		 System.out.println("Area of circle for r=7: ");
		 System.out.println(pi*r*r);
	}
	void AreaOfCircle2() {
		double r=14;
		 System.out.println("Area of circle for r=14: ");
		 System.out.println(pi*r*r);
	}
	public static void main(String[] args) {
		
		System.out.println("Assignment 30: WAP to   calculate the area of circle."
				+ "(pi value should be final static local variable and initialise.");
		AreaOfCircle1();
		AreaOfCircle a1=new AreaOfCircle();
		a1.AreaOfCircle2();
		
	}

}