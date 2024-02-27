package encapsulationPkg;

class Amazon{
	private String username="abc@grotechminds.com";

	public String getUsername() {
		return username;		//fetching value
	}
	public void setUsername(String username) {
		this.username = username;
	}
}

public class EncapsulationClass {
	public static void main(String[] args) {
		System.out.println("Assignment 95: WAP to update the value of private variable username = \"abc@grotechmind.com"
				+ "\" to something else using getter and setter");
		
		Amazon a1=new Amazon();
		System.out.println("Original value: " + a1.getUsername());
		a1.setUsername("smita@gmail.com");
		System.out.println("Updated value: "+a1.getUsername());
	}

}
