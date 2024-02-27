package encapsulationPkg;

class Student_Data{
	private String s1="abc@grotechmind.com";

	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
}
public class EncapuslationInt {

	public static void main(String[] args) {
		System.out.println("Assignment 95: WAP to update the value of private variable username = \"abc@grotechmind.com"
				+ "\" to something else using getter and setter");
		Student_Data sd=new Student_Data();
		System.out.println("Original String: " +sd.getS1());
		sd.setS1("smita@mail.com");
		System.out.println("Updated String: " + sd.getS1());
		
	}

}
