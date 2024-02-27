package arrayStringAssignments;

public class FindCharNum {

	public static void main(String[] args) {
		System.out.println("Assignment 79: Take any alphanumeric String and find out which are numeric values and "
				+ "characters and print it");
		String s1 = "smita123";
		char c1[]=s1.toCharArray();
		
		for (int i=0 ;  i <c1.length ;i++)
		{
			System.out.println(c1[i]);
		}
		//System.out.println(s1.toCharArray());
		//System.out.println(char c1 []=s1.toCharArray());
		
		int count_Char = 0 ;
		int Count_no = 0;
		for(int i=0;i<s1.length();i++) {
		boolean answer=	Character.isDigit(c1[i]);
		
		if(answer==true) {
			System.out.println( c1[i]     +  " is a digit: "+answer);
			Count_no++;
		}
		else {
			System.out.println( c1[i]    +" is a char: "+answer);
			count_Char++;
		}
		
		System.out.println("The Count of Alphabets " + count_Char);
		System.out.println("The Count of Digit " +Count_no );
		
		}
	}
}
