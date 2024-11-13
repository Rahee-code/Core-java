package Collection;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(2);
		ll.add(5);
		ll.add("java");
		System.out.println(ll);
		
		System.out.println(ll.get(4));
		System.out.println(ll.contains("java"));
		ll.addFirst(0);
		ll.addLast("programming");
		ll.removeLastOccurrence(2);
		System.out.println(ll);
	}

}
