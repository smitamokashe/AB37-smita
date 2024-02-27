package UpCastingpkg;
class UpCasting14{
	void UpCastings4() {
		System.out.println();
	}
}
class UpCasting13 extends UpCasting14{
	void UpCastings3() {
		System.out.println();
	}
}

class UpCasting12 extends UpCasting13{
	void UpCastings2() {
		System.out.println();
	}

public class UpCastingProblem5 extends UpCasting12 {
	void UpCastings1() {
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Assignment 93: Upcasting and downcasting Problem 5 as per Diagram during Class");
		UpCasting13 up= new UpCasting12();
		up.UpCastings3();
		up.UpCastings4();
		
		//downcasting
		UpCastingProblem5 up1 = (UpCastingProblem5) up;
		up1.UpCastings1();
		up.UpCastings3();
		up.UpCastings4();


	}
}
}