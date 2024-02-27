package stringFunctions;

public class StringFunc {

	public static void main(String[] args) {
		
		String fname="smitaAmolPatil";;
		//String lname="Manchurian";
		
		//System.out.println(fname.concat(lname));
		//System.out.println(fname.concat(" ").concat(lname));
		
		System.out.println(fname.charAt(3));
		
		System.out.println(fname.indexOf('i'));
		
		System.out.println(fname.substring(2));
		
		System.out.println(fname.substring(1, 4));
		
		System.out.println(fname.contains("A"));
		
		System.out.println(fname.matches("smitaAmolPatil"));
		
		String s1="";
		System.out.println(s1.isEmpty());
		System.out.println(fname.endsWith("l"));
		
	}

}
