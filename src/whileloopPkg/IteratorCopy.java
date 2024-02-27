package whileloopPkg;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCopy {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    
	    ArrayList<Integer> numbers1 = new ArrayList<Integer>();
	    Iterator<Integer> it = numbers.iterator();
	    while(it.hasNext()) {
	      Integer i = it.next();
	      for (int i1 = numbers.size()-1; i1 >= 0; i1--) {
	    }
	    System.out.println(numbers1);
	}
}
}