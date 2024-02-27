package exceptionHandling;

public class CountDigit {

	public static void main(String[] args) {
		String str="india2047";
		char[] c1=str.toCharArray();
		int i = 0;
		Character.isDigit(c1[i]);
		
		for( i=0;i<str.length();i++) {
			boolean ans=Character.isDigit(c1[i]);
			System.out.println(ans);
			
			if(ans==true) {
				System.out.println(c1[i]  + "is digit"  +ans);
			}
			else {
				System.out.println("character");
			}
	}
		
	}
}
