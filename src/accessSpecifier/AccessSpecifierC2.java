package accessSpecifier;

public class AccessSpecifierC2 {
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
}