package arraysPkg;

public class CountDigit {

	public static void main(String[] args) {
		String name="Smita123";
		char c []= name.toCharArray();
		int i;
		int count =0;
		 for( i = 0; i < name.length(); i++) { 
			 boolean ans=Character.isDigit(c[i]);
			 if(ans == true) {
					count++;
				}
		 }
		 System.out.println("Total number of digits in a string: " + count);
	}

}
