package inhertance1;
class Teacher
{
	static void selenium() {
		System.out.println("Selenium");
	}
	
	static void java() {
		System.out.println("Java");
	}	
}
public class Student extends Teacher
{	static void gk() {
	System.out.println("General knowledge");
}
public static void main(String[] args) 
{
	selenium() ;
	 java();
	 gk();
}
}
