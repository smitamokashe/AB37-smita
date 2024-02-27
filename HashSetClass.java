package collectionPkg;

import java.util.Collections;
import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		System.out.println("Assignment 103: WAP on HashSet");
		HashSet hs = new HashSet();
		hs.add("smita");
		hs.add("anvi");
		hs.add("amol");
		hs.add("patil");
		
		hs.add("amol");
		hs.add("patil");
		
	/*	hs.add(null);
		hs.add(12);
		hs.add(12.89);
		hs.add(true);*/
		System.out.println(hs);
	}
}