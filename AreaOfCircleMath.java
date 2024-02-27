package mathpkg;

public class AreaOfCircleMath {

	public static void main(String[] args) {
		System.out.println("Assignment 94: findout the area of a circle for ten times,take pi value from math.pi and take r "
				+ "value from math.random and solve this problem 10 times.");
		double pi=Math.PI;
		for(int i=0;i<10;i++) {
			double areaOfCircle= pi* Math.random()*Math.random();
			System.out.println("Area Of Circle: " + areaOfCircle);
		}
	}

}
