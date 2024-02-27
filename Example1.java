package stringrev;

public class Example1 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;

		int arr1[] = new int[4];

		//copy and reverse order
		for (int i = arr.length-1; i >= 0; i--) {
			arr1[i] = arr[i];
			System.out.println(arr1[i]);
		}
	}
}
