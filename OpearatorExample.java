package ScannerPkg;
import java.util.Scanner;
public class OpearatorExample {

	public static void main(String[] args) {
		
		//System.out.println("Check Eligibilty For Voting");
		Scanner sc = new Scanner(System.in);
		
		int age;
		System.out.println("Enter Age Of a Person: ");
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("I am adult");
		}
		else {
			System.out.println("I am young");
		}
	}
}
