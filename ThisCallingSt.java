package thisCalling;

public class ThisCallingSt {
	
	ThisCallingSt(){
		this(4);
		System.out.println("lets add");
	}
	
	ThisCallingSt(int a){
		this(4,7);
		System.out.println(a+6);
	}
	ThisCallingSt(int b,int c){
		this("smita");
		int sum=b+c;
		System.out.println(sum);
	}
	
	ThisCallingSt(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
			new ThisCallingSt();
	}

}
