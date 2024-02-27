package collectionPkg;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		System.out.println("Assignment 104: WAP on LinkedHashSet");
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("smita");
		lhs.add("anju");
		lhs.add("amol");
		lhs.add("anvi");
		
		lhs.add(33);
		lhs.add(78);
		lhs.add(true);
		lhs.add(null);
		
		
		//Collections.sort(lhs);
		
		System.out.println(lhs);
	}

}
