package thisKeywordpkg;

public class ManyConstructCall {
	
	public ManyConstructCall(){
		this(1,2,3,4);
		System.out.println("Constructor has no args");
	}
	
	public ManyConstructCall(int a, int b,int c,int d) {
		this("Smita");
		int add = a+b+c+d;
		System.out.println(add);
	}
	
	public ManyConstructCall(String a) {
		this('a');
		System.out.println("i am string");
	}
	public ManyConstructCall(char a){
		System.out.println('a');
	}

	public static void main(String[] args) {
		new ManyConstructCall();

	}

}
