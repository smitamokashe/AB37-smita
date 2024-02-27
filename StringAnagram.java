package stringrev;
import java.util.Arrays;
public class StringAnagram {
	public static void main(String[] args) {
		System.out.println("Assignment 84: Check if 2 given strings are anagram of each other or not");
		String s1="animal";
		String s2="manila";
		
		if(s1.length() != s2.length()) {
			System.out.println("String is not an anagram");
		}
		else {
			char [] c1=s1.toCharArray();
			Arrays.sort(c1);
			System.out.println("String 1 animal: "+Arrays.toString(c1));
			
			char [] c2=s2.toCharArray();
			Arrays.sort(c2);
			System.out.println("String 2 manila: "+Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("String is an anagram");
			}
		}
	}
}