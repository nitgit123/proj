package jcf;

import java.util.ArrayList;
import java.util.Iterator;

public class DIterator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(10);
		al.add(12);
		System.out.println("---Dis Using Iterator----");
		Iterator<Integer> it1 = al.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next() + "");
		}
		System.out.println("----DB using forEach Reaming-------");
		Iterator<Integer>it2=al.iterator();
		it2.forEachRemaining((k)->{
			System.out.println(k+"");
		});
	}

}
