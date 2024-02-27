package collectionPkg;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		System.out.println("Assignment 100: WAP on Vector");
		Vector v1=new Vector();
		v1.add("Smita");
		v1.add("Anvi");
		v1.add("Vishal");
		v1.add("Anju");
		v1.add(null);
		v1.add(15);
		v1.add(20);
		v1.add('c');
		v1.add(true);
		v1.add(55.09);
		v1.add(0);
		//Collections.sort(v1);
		
		System.out.println(v1);
	}

}
