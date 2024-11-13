package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(0);
		l.add(12);
		Vector v=new Vector();
		v.add(1);
		v.addElement(2);
		v.add(2, 3);
		v.add(1);
		v.add(null);
		v.add("java");
		v.add(null);
		//v.addAll(1, l);
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		System.out.println(v);
		
		System.out.println("--------Iterate through enumeration cursor");
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement()); 
		}
		System.out.println("--------Iterate through Iterator cursor");
		Iterator i=v.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());	
		}
		System.out.println("---------Iterate through ListIterator cursor\nForward direction");
		ListIterator lt=v.listIterator();
		while (lt.hasNext()) {
			System.out.println(lt.next());
			
		}
		System.out.println("Backward direction");
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}
		

	}

}
