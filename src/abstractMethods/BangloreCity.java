package abstractMethods;

class KarnarakState{
	void ITHUB() {
		System.out.println("Banglore is the best city in  India");
	}	
}
public class BangloreCity extends KarnarakState{
	
	void ITHUB() {
		//super.ITHUB();
		System.out.println("Silicon city of India");
		super.ITHUB();
	}
	
	public static void main(String[] args) {
		BangloreCity b1 = new BangloreCity();
		b1.ITHUB();
	}

}
