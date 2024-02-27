package test.java;

public class Assignment33 {
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
		
		System.out.println("Assignment 33: WAP to find the Area of Circle , keep pi as static global final , create 2 methods 1 "
				+ "having r = 7 and another having r =14");
		AreaOfCircle1();
		AreaOfCircle a1=new AreaOfCircle();
		a1.AreaOfCircle2();
		
	}
}
