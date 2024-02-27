package stringFunctions;

public class StrVerticalPrint {
	public static void main(String[] args) {
		System.out.println("Assignment 68: M1=Software M2=Testing Output should print as:SoftwareTesting in a vertical way like below");
		String m1="Software";
		String m2="Testing";
		
		for(int i=0;i<m1.length();i++) {
			System.out.println(m1.charAt(i));
		}
			for(int j=0;j<m2.length();j++) {
				System.out.println(m2.charAt(j));
			}	
	}
}
