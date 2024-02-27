package thisKeywordpkg;

public class ThisClass {
	
	int age;					//global variable   0
	String name;				//null
	double salary;
	void student_details(int age, String name,double salary) {					//local var, don't have default value
		this.age=age;
		this.name=name;
		this.salary=salary;
		System.out.println("Student details is as follows: ");
	}
	public static void main(String[] args) {
		ThisClass ts=new ThisClass();
		ts.student_details(11, "Smita",8.5);
	    System.out.println(ts.age);
		System.out.println(ts.name);
		System.out.println(ts.salary);
	}
}
