/*Name:Smita Mokashe
 Batch:AB_37
 Assignment 19: WAP to find out default values of byte,short ,int, long,double,float,boolean,char and string 
 data types using global variable
 */
package test.java;
public class DefaultValuesGlobalVar {
	int a;
	byte b;
	long l;
	short s;
	double d;
	float f;
	char c;
	boolean b1;
	String s1;
	public static void main(String[] args) {
		System.out.println("Assignment 19: WAP to find out default values of byte,short ,int, long,double,"
				+ "float,boolean,char and string data types using global variable");
		DefaultValuesGlobalVar d1=new DefaultValuesGlobalVar();
		System.out.println("Integer: "+d1.a);
		System.out.println("Byte: "+d1.b);
		System.out.println("Long: "+d1.l);
		System.out.println("Short: "+d1.s);
		System.out.println("Double: "+d1.d);
		System.out.println("Float: "+d1.f);
		System.out.println("Char: "+d1.c);
		System.out.println("Boolean: "+d1.b1);
		System.out.println("String: "+d1.s1);
 }
}
