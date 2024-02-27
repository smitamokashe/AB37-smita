package typecastingDemo;

public class ByteToDouble {

	public static void main(String[] args) {
		System.out.println("Assignment 89: Convert int to Double and double to byte");
		
		int b1=30;
		double d1=b1;
		System.out.println("Int To Double: " +d1);
		
		byte a1=(byte) d1;					//Explicite. widening
		System.out.println("Double to byte: " +a1);
	}

}
