package classtypecasting;

class ExcelSheet{
	void datafetching(){
		System.out.println("Parent/super class method");
	}
}

public class TestCase1 extends ExcelSheet{
	void logInToLogout() {
		System.out.println("child/sub class methods");
	}
	public static void main(String[] args) {
		//upcasting
		//left hand          right hand
		ExcelSheet ex=new TestCase1();				//upcasting
		ex.datafetching();	
		
		//downcasting
		TestCase1 t1=(TestCase1) ex;
		t1.datafetching();
		t1.logInToLogout();
	}
}