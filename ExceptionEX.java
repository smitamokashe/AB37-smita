package abstractMethods;

public class ExceptionEX {

	public static void main(String[] args) {
		try {
		System.out.println("Exception");
		int  a = 1/0;
		System.out.println("execution continued");
		}
		catch(Exception e){
			System.out.println("in catch block");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getClass());
			}

	}

}
