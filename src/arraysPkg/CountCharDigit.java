package arraysPkg;

public class CountCharDigit {

	public static void main(String[] args) {
		System.out.println("Assignment 81: Find out number of char and number of digits in below string Smita123");
		String name="Smita123";
		char c []= name.toCharArray();
		int i;
		int count =0;
		int digit=0;
	
		 for( i = 0; i < name.length(); i++) { 
			 boolean ans=Character.isAlphabetic(c[i]);
			 if(ans == true) {
					count++;
				}
			 else if(ans==false) {
				 digit++;
			 }
		 }
		 System.out.println("Total number of characters in a string: " + count);
		 System.out.println("Total number of digits in a string: "+digit);
}
}