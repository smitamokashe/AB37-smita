package arraysPkg;

public class AvgofArray {

	public static void main(String[] args) {
		System.out.println("Assignment 66: Create an array of length 4 of int data type and find out average of those numbers and remainder of those");
		int num[]=new int[4];
		num[0]=1;
		num[1]=20;
		num[2]=33;
		num[3]=4;
		
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
		double avg=sum/num.length;
		System.out.println("Average: " +avg);
		double rem= sum%num.length;
		System.out.println("Remainder: "  +rem);
	}

}
