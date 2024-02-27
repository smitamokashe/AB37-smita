package encapsulationPkg;

class Authentication_Api{
	private String username="contact@grotech.com";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	private String password="password@123";
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		Authentication_Api au=new Authentication_Api();
		System.out.println("Original values:");
		System.out.println(au.getUsername());
		System.out.println(au.getPassword());
		au.setUsername("anvi@gmail.com");
		au.setPassword("Anvi@123");
		System.out.println("Updated values:");
		System.out.println(au.getUsername());
		System.out.println(au.getPassword());

	}

}
