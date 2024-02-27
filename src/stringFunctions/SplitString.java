package stringFunctions;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		String s1="India is my country";
		String s2 []=s1.split("I");
		System.out.println(Arrays.toString(s2));
		
		String[] s3=new String[4];
		s3[0]="India";
		s3[1]="Is";
		s3[2]="My";
		s3[3]="Country";
		System.out.println(Arrays.toString(s3));
	}

}
