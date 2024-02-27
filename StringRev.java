package stringFunctions;

public class StringRev {

	public static void main(String[] args) {
		String name= "Anvi";
		String myname=name.toLowerCase();
		System.out.println("Original String: " +myname);
		
		//for(int i=myname.indexOf('i') ; i>=0  ;i--)
		System.out.println("Reverse String: ");
		
		for(int i=3;i>=0;i--) {
			System.out.println(myname.charAt(i));			//Horizontal
		}
	}

}
