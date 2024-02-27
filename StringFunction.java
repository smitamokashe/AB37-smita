package stringFunctions;

public class StringFunction  extends B{
	 //SupercallingStatement(){
	//	super();
		//System.out.println("3");
	//}
	public static void main(String[] args) {
		//new SupercallingStatement();
		int a=40;
		int b=60;
		
		if(a>40|| b<60) {
			System.out.println(1);
		}
		if(a<40 && b>60) {
			System.out.println(2);
		}
		if(!(a<40 || b>60)) {
			System.out.println(3);
		}
		if(!(a<40 && b>60)) {
			System.out.println(4);
		}
	}
}

class StringFunction1{
	StringFunction1() {
		
		System.out.println("1");
	}
}
	class B extends StringFunction1{
		B(){
			System.out.println("2");
		}
	}

	
		
		/*String name="MANISH";
		
		for (int i=0;i<=5;i++) {
			System.out.println(name.charAt(i));
		}
		//String name1= "     Anvi Patil      ";
		
	/*	System.out.println(name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		//System.out.println(name.codePointAt(1));
		System.out.println(name.concat(" Patil"));
		System.out.println(name1);
		System.out.println(name1.trim());*/
	//}
//}