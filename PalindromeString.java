package stringrev;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Assignment 83: Check if the String is Palindrome");
		String input = "madam";
		String output="";
		System.out.println("Original String: " +input);
		for(int i =input.length()-1;i>=0;i--) {
			char reverse = input.charAt(i);
			output=output+reverse;
		}
		System.out.println("Reversed String: " +output);
		if(input.equals(output)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
