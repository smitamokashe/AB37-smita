package superCallingpkg;

class One11{
	One11(){
		System.out.println("1");
	}
}

class Two11 extends One11{
	Two11(){
		System.out.println("2");
	}
}
public class Class3 {
	Class3(){
		System.out.println("3");
	}

	public static void main(String[] args) {
		//Class3 c=new Class3();
		new Two11();
	}

}
