package arrayStringAssignments;

public class IndexOfNum {

	public static void main(String[] args) {
		System.out.println("Assignment 76: Create an array of length 5. Find out the index of number 41");
		int num []= {12,50,78,89,41};
		int indexToSearch=41;
		int temp=0;
		
		for(int i=0;i<num.length;i++) {
			if(indexToSearch==num[i] ){
				System.out.println("Num present at index: " +i);
				temp++;
			}
		}
		if(temp==0) {
			System.out.println(temp   + "Number to be search is not present. ");
		}
	}
}
