package arraysPkg;

public class IndexOfDigit {

	public static void main(String[] args) {
		System.out.println("Assignmet 80: Take any alphanumeric String and check at which position there is numeric value");
		String name="Smita123";
		char c []= name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			boolean ans=Character.isDigit(c[i]);
			if(ans==true) {
				System.out.println(" Index of " + c[i]  + "  is: " +i);
			}
		}
	}

}
