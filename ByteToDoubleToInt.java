package typecastingDemo;

public class ByteToDoubleToInt {

	public static void main(String[] args) {
		System.out.println("Assignment 88:Convert Byte into Double and Double into int");
		
		byte b=20;
		double b1=b;
		System.out.println("Convert Byte to Double: " + b1);
		
		int a=(int) b1;							//explicite. widening
		System.out.println("Convert Double To Int: " + a);
	}

}
