package inheritanceAssignment;

class Teachers{
	void selenium() {
		System.out.println("Selenium");
	}
	void java() {
		System.out.println("Java");
	}
	
}
public class Students extends Teacher 
{
	static void gk() {
		System.out.println("General knowledge");
	}
	public static void main(String[] args) {
		System.out.println("Assignment44:WAP for single level inheritance where gk method(child) is static and parent"
				+ "(selenium and java) are non static.");
		 gk();
		Teachers t=new Teachers();
		t.selenium();
		t.java();
		}
}
