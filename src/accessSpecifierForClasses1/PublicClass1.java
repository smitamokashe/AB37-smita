package accessSpecifierForClasses1;
import accessSpecifierForClassesPkg.PublicClass3;

class DefaultClass2{
	void class2Method() {
		System.out.println("Default Class 2 method");
	}
}
public class PublicClass1 {
	void class1Method() {
		System.out.println("Public class 1 method");
	}
	public static void main(String[] args) {
		System.out.println("Assignment 105: WAP for Access Specifier for Class  Create 2 packages package 1 having "
				+ "2 methods one public having main and one default , package 2 having 2 methods one public and one default "
				+ "with no main method");
		PublicClass1 ps=new PublicClass1();
		ps.class1Method();
		
		DefaultClass2  ds=new DefaultClass2();
		ds.class2Method();
		
		PublicClass3 pss=new PublicClass3();
		pss.class3Method();
	}
}
