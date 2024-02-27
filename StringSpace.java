package stringFunctions;

public class StringSpace {

	public static void main(String[] args) {
		String name="World no 1 @*";
		char c[]=name.toCharArray();
		int count=0;
		int temp=0;
		for(int i=0;i<name.length();i++) {
			boolean ans=Character.isDigit(c[i]);
			if(ans==true) {
				count++;
			}
			else {
				temp++;
			}
		}
		System.out.println("Number of didgit: "+count);
		System.out.println("Number of char: "+temp);

	}

}
