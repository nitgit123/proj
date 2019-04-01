package jcf;

import java.util.ArrayList;
import java.util.ListIterator;

public class DListIterator {

	public static void main(String[] args) {
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(10);
al.add(11);
al.add(12);
ListIterator<Integer>it1=al.listIterator();
System.out.println("---forword----");
while(it1.hasNext()) {
	System.out.println(it1.next());
}
System.out.println("\n---backword----");
while(it1.hasPrevious()) {
	System.out.println(it1.previous()+"");
}

	}

}
