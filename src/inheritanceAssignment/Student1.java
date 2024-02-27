package inheritanceAssignment;

class Teacher1{
	void selenium() {
		System.out.println("Selenium");
	}
	void java() {
		System.out.println("Java");
	}

}
public class Student1 extends Teacher1 {
	
	void gk() {
		System.out.println("General knowledge");
	}

	public static void main(String[] args) {
		
		System.out.println("Assignment 43: WAP for single level inheritance in a single program and make all methods"
				+ " non static(selenium,java,gk) by creating object in child class");
			Student1 s = new Student1();
		 	s.gk();
			Teacher t=new Teacher();
			t.selenium();
			t.java();
	}

}
