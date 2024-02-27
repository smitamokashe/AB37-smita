package inheritanceTypes30_11;

interface Amazon{
	void login();
	void logout();
}
public class Assignment49 implements Amazon{
	
	public static void main(String[] args) {
		System.out.println("Assignment 49: Create a class and in this create interface as Amazon with login and logout"
				+ " methods also create child class and create relation between them ");
		
		Assignment49 a1=new Assignment49();
		a1.login();
		a1.logout();
	}
	public void login() {
		System.out.println("Login method from interface Amazon");
	}

	public void logout() {
		System.out.println("Logout method from interface Amazon");
	}

}
