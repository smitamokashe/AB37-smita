package stringFunctions;

public class Assignment70Rev {

	public static void main(String[] args) {
		System.out.println("Assignment 70: M1=\"My Name is Smita .Output should print in reverse order as : atimS si emaN yM");
		String name= "My name is Smita";
		String myname=name.toLowerCase();
		System.out.println("Original String: " +myname);
		
		System.out.println("Reversed String: ");
		
		for(int i=myname.length()-1;i>=0;i--) {
			System.out.print(myname.charAt(i));			
		}

	}

}
