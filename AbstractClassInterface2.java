package interfacePkg;

interface Bank1{
	void account_info();
}
interface Account{
	void account_no();
}

abstract class Print implements Bank1,Account{
	abstract void printStatement();
}

public class AbstractClassInterface2 extends Print{

	public static void main(String[] args) {
		AbstractClassInterface2 ac= new AbstractClassInterface2();
		ac.account_info();
		ac.account_no();
		ac.printStatement();
	}
	public void account_info() {
		System.out.println("Assignment 49: Create class and 2 interfaces and create abstract class:"
				+ "Class extends abstract class, abstract class implements 2 interfcaes");
		
		System.out.println("account_info method from Bank1 interface");
		System.out.println("Account information is : 111, smita,565656565");
	}
	
	public void account_no() {
		System.out.println("account_no method from Account interface");
		System.out.println("Account number is: 5642356");
	}

	void printStatement() {
		System.out.println("Print_statement  method from print abstract class");
	}
}
