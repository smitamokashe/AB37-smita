package encapsulationPkg;
class StudentData{
	private String username="Smita";
	private int id=100;
	private  char c='S';
	private float f=65557;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	private double salary=89870.8;
	private boolean b=true;
}

public class EncapsulationWithAll_DT {

	public static void main(String[] args) {
		System.out.println("Assignment 96: WAP to use getter and setter with int, char, boolean, string, float, double ");
		StudentData sd=new StudentData();
		System.out.println("Original String: " +sd.getUsername());
		System.out.println("Original String: " +sd.getId());
		System.out.println("Original String: " +sd.getC());
		System.out.println("Original String: " +sd.getF());
		System.out.println("Original String: " +sd.getSalary());
		System.out.println("Original String: " +sd.isB());
		System.out.println("*****************************************************");
		sd.setUsername("smita@mail.com");
		System.out.println("Updated String: " + sd.getUsername());
		
		sd.setId(200);
		System.out.println("Updated Id: " + sd.getId());
		
		sd.setC('B');
		System.out.println("Updated Char: " + sd.getC());
		
		sd.setF(45456);
		System.out.println("Updated Float: " + sd.getF());
		
		sd.setSalary(909090);
		System.out.println("Updated double salary: " + sd.getSalary());
		
		sd.setB(false);
		System.out.println("Updated Boolean: " + sd.isB());
	}

}
