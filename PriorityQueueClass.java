package collectionPkg;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {
		System.out.println("Assignment 101: WAP on PriorityQueue");
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("smita");
		pq.add("Anvi");
		pq.add("Vishu");
		pq.add("zebra");
		
		//pq.add(null);
		//pq.add(12);
		//pq.add(12.78);
		//pq.add(true);
		//Collections.sort(pq);
		
		System.out.println(pq);
	}

}
