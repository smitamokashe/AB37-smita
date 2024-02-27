package thisKeywordpkg;

public class SuperCallingStmt extends parentClass{
	
	public SuperCallingStmt() {
		System.out.println("constructor of main class");
	}

	public static void main(String[] args) {
		System.out.println("WAP to execute Super calling statement");
		new SuperCallingStmt();
	}
}

class parentClass{
	public parentClass() {
		System.out.println("Method from super class");
	}
}