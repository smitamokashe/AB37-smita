package stringrev;
public class MatchesString {
	public static void main(String[] args) {
		System.out.println("Assignment 85: Declare 2 Strings and check if they are Equal");
		String a ="Amol";
		String input="i love my India";
		boolean a1=a.matches("....");
		System.out.println(a1);
		
		boolean a2=a.matches("...");
		System.out.println(a2);
		
		boolean a3=a.matches("A...");
		System.out.println(a3);
		
		boolean a4=a.matches("A(.*)");
		System.out.println(a4);
		
		boolean a5=input.matches("(.*)love(.*)");
		System.out.println(a5);
	}
}
