package stringrev;

public class StringRev {

	public static void main(String[] args) {
		System.out.println("Assignment 82: Reverse a String and Print it");
		String input ="smita";
		String output="";
		System.out.println("Original string: "+input);
		for(int i =input.length()-1;i>=0;i--) {
			char reverse = input.charAt(i);
			output=output+reverse;
		}
		System.out.println("Reversed String: " +output);
	}

}
