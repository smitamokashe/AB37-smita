package collectionPkg;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		System.out.println("WAP to execute the while loop");
		LinkedList ll=new LinkedList();
		ll.add("smita");
		ll.add("Anvi");
		ll.add("Vishu");
		ll.add("zebra");
		//Collections.sort(ll);
		
		ll.add(12);
		ll.add(12.67);
		ll.add(true);
		ll.add(null);

		ll.add("Vishu");
		ll.add("zebra");
		
		System.out.println(ll);
	}

}
