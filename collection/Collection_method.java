package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//difference between array and collection
		int arr[]= {1,2,3,4,5};
		String a[]= {"java","python"};
		Collection<String> c3=List.of("java","python");//you cannot write primitive data like int  type in <> only write non-primitive
		System.out.println(c3);
		
		//int arr1[]= {1,2,"java"};
		Collection c2=List.of(1,2,3,"java",true,42.25f,'a');
		System.out.println(c2);
		
		Collection c4=new ArrayList();
		c4.add(1);
		c4.add(2);
		System.out.println(c4);
		c4.add(3);
		System.out.println(c4);
		
		System.out.println("-------------------------------------");
		//collection methods 
		Collection c=new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		System.out.println(c);
		Collection c1=new ArrayList();
		c1.add(4);
		c1.add(5);
		c1.add(6);
		System.out.println(c1);
		c.addAll(c1);
		System.out.println(c);
		c.remove(2);
		System.out.println(c);
		c.removeAll(c1);
		System.out.println(c);
		System.out.println(c.contains(3));
		System.out.println(c.containsAll(c1));
		System.out.println(c.isEmpty());
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c.size());
		c.clear();
		System.out.println(c);
	}

}