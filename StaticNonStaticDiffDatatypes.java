/*Name:Smita Mokashe
 Batch AB_37
 Assignment 11: WAP where in a class, there are 5 methods(3static, 2non static) with same name....
 first method argument is int a, second method argument is double a,third method argument is char a,
 fourth method argument is boolean a and fifth method argument is String a
 */
package test.java;
public class StaticNonStaticDiffDatatypes {
	static void method(int a) {
		System.out.println("Static method 1 with integer parameter: "+a);
	}
	static void method(double d) {
		System.out.println("Static method 2 with double parameter: " +d);
	}
	static void method(char c) {
		System.out.println("Static method 3 with char parameter: " +c);
	}
	void  method(boolean b) {
		System.out.println("Non Static method 1 with boolean parameter: " +b);
	}
	void method(String s) {
		System.out.println("Non Static method 2 with String parameter: " +s);
	}
	public static void main(String[] args) {
		System.out.println("Assignment 11: WAP where in a class, there are 5 methods(3static, 2non static) "
				+ "with same name..first method argument is int a, second method argument is double a"
				+ ",third method argument is char a, fourth method argument is boolean a and fifth method "
				+ "argument is String a");
		method(10);
		method(10.10);
		method('S');
		StaticNonStaticDiffDatatypes nsd = new StaticNonStaticDiffDatatypes();
		nsd.method(true);
		nsd.method("Smita");
	}
}
