package mathpkg;

public class MathClass1 {

	public static void main(String[] args) {
		int
		ans =Math.addExact(10, 20);
		System.out.println(ans);
		
		int res =Math.subtractExact(20, 10);
		System.out.println(res);
		
		int output=Math.multiplyExact(ans, res);
		System.out.println(output);
		
		int a = Math.max(ans, output);
		System.out.println(a);
		for(int i=0;i<=10;i++) {
		System.out.println(Math.random());
		}
	}

}
