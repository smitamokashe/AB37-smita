package typecastingDemo;

public class CovertByteToShort {

	public static void main(String[] args) {
		System.out.println("Assignment 87: Convert your Age from byte to short");
		//byte to short
		byte age=20;
		Short age1 =(short) age;			//explicite.  widening
		System.out.println("Convert Byte to short: " +age1);
	}

}
