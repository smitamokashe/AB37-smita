package accessSpecifier;

public class AccessSpecifierClass {
	int a=10,b=5;
	int res=0;
	public void add() {
		res=a+b;
		System.out.println("Additon: " +res);
	}
	protected void sub() {
		res=a-b;
		System.out.println("Subtraction: " +res);
	}
	private void mul() {
		res=a*b;
		System.out.println("Multiplication: " +res);
	}
void div() {
	res=a/b;
	System.out.println("Division: " +res);
}
	public static void main(String[] args) {
		System.out.println("Assignment 57: Create a class with 4 different methods other than main method with 4 different access specifiers and try "
				+ "to access them within class");
		AccessSpecifierClass as =new AccessSpecifierClass();
		as.add();
		as.sub();
		as.mul();
		as.div();

	}

}
