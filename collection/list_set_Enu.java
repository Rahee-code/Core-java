package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class list_set_Enu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----------------------LIST---------------------------------
		//difference between list and set
		//list contain value in same order which given by user
		//it is index base 
		List<Integer> l=new ArrayList();//list add method of collection also and own also
		l.add(2);
		l.add(1, 3);
		l.addFirst(1);
		l.addLast(4);
		l.add(4);
		l.add(null);
		l.add(null);
		//System.out.println(l);
		
		//types of iteration
		//1.for loop      //iterate on index based
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
//		
		//2.while loop
//		int i=0;
//		while(i<l.size())
//		{
//			System.out.println(l.get(i));
//			i++;
//		}
		
//		//3.foreach loop  //iterate on value directly
//		for(Integer i1:l)
//		{
//			System.out.println(i1);
//		}
//		
//		//4.iterator
//		Iterator i2=l.iterator();
//		while(i2.hasNext())
//		{
//			System.out.println(i2.next());
//		}
//		
//		//5.ListIterator
//		ListIterator lt=l.listIterator();
//		while(lt.hasNext())
//		{
//			System.out.println(lt.next());
//		}
//		while(lt.hasPrevious())
//		{
//			System.out.println(lt.previous());
//		}
		
		//-----------------------SET---------------------------------
		//it is not index base
		//set contain its own order 
//		Set<Integer> s=new HashSet();//set have add method of collection only
//		s.add(10);
//		s.add(20);
//		s.add(30);
//		s.add(30);
//		s.add(null);
//		s.add(null);
//		System.out.println(s);
//		
//		//types of iteration
//				
//		//3.foreach loop  //iterate on value directly
//		for(Integer i1:s)
//		{
//			System.out.println(i1);
//		}
//		
//		//4.iterator
//		Iterator i3=s.iterator();
//		while(i3.hasNext())
//		{
//			System.out.println(i3.next());
//		}
		//-------------------------VECTOR----------------------------
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println("Iterate through enumeration cursor");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Iterate through Iterator cursor");
		Iterator i=v.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());	
		}
		System.out.println("Iterate through ListIterator cursor\nForward direction");
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