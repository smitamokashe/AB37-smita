package typecastingDemo;

public class CovertIntToDouble {

	public static void main(String[] args) {
		System.out.println("Assignment 86: Convert Weight from int to double and from double to int");
		
		//convert weight int to double
		double weight=50;		//widening
		//implicite
		System.out.println(weight);
		
		//convert double to int
		int weight1=(int) 50.5;		//narrowing
		System.out.println(weight1);
	}

}
