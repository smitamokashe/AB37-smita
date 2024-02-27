package thisKeywordpkg;

public class thisKeyword extends SuperCalled {
	int age;
	String name;
	double salary;
	String company;
	
	void Employee(int age,String name,double salary,String company) {
		this.age=age;
		this.name=name;
		this.salary=salary;
		this.company=company;
		
		System.out.println("Method variable values: ");
		System.out.println("Age: " +age );
			System.out.println("Name: "+name );
			System.out.println("Salary: "+salary);
				System.out.println("Company: "+company);
	}
	
	public thisKeyword() {
		System.out.println("Constructor");
	}
	

	public static void main(String[] args) {
		System.out.println("Assignment: WAP to execute THIS keyword");
		System.out.println("Executing this keyword and super calling statement together");
		thisKeyword t1=new thisKeyword();
		System.out.println("Default values for global variable:");
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		System.out.println(t1.company);
		
		t1.Employee(111, "Smita", 12, "CTE");
		
		System.out.println("Updated values");
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		System.out.println(t1.company);
	}

}

class SuperCalled{
	public SuperCalled() {
		System.out.println("Super class constructor");
	}
}
