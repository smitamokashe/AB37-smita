package collectionPkg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {

	public static void main(String[] args) {
		System.out.println("Assignment 99: WAP on ArrayList");
		ArrayList a1=new ArrayList();
		a1.add("Smita");
		a1.add("Anvi");
		/*a1.add(10);
		a1.add('A');
		a1.add(true);
		a1.add(12.56);
		a1.add(null);*/
		Collections.sort(a1);
		System.out.println(a1);
	}
}