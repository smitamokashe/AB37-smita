package assertPkg;

public class AssertKw {

	public static void main(String[] args) {
		System.out.println("Assignment 108: WAP to use Assert keyword with assert syntax1");
		String name="Smita";
		
		assert name.length()>1;
		String answer = name.concat(" Patil");
		System.out.println(answer);

	}
//assertfailure
//	run config- args = write -ea
}
