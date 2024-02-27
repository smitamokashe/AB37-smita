package stringFunctions;

public class FindArray {

	public static void main(String[] args) {
		System.out.println("Assignment 75: Create an array of length 4 of int data type. Find out 41 is present or not in array. "
				+ "Print message in both the cases.");
		
		int num []= {78,89,100,41};
		
		int idToCheck=78;
		for(int i=0;i<num.length;i++) {
			if(idToCheck==num[i]) {
				System.out.println("Number found: " +num[i]);
				break;	
			}
			else {
				System.out.println("Number not found");
				break;
			}
		}
	}
}

 
 /*int arr[] = new int[4];
		arr[0]=78;
		arr[1]=89;
		arr[2]=100;
		arr[3]=4;*/
 
 
  /*  int[] num = {1, 2, 3, 4, 5};
    int toFind = 3;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    */
    /*if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found.");
  } */
