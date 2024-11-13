package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add(1);
		h.add("java");
		h.add(null);
		h.add(2);
		h.add(5);
		h.add(null);
		h.add(1);
		h.add("1");
		System.out.println(h);
		h.remove(5);
		System.out.println("Size: "+h.size());
		System.out.println("Contains(java): "+h.contains("java"));
		System.out.println(h);
//		
		System.out.println("-------Remove duplicate in array----------");
		int arr[]= {1,2,3,4,2,5,1};
		HashSet h1=new HashSet();
		for(int i=0;i<arr.length;i++)
		{
			h1.add(arr[i]);
		}
		System.out.println(h1);
		
		
		System.out.println("-------Remove duplicate in String----------");
		String s="java";
		LinkedHashSet h2=new LinkedHashSet();//Follows insertion order
		for(int i=0;i<s.length();i++)
		{
			h2.add(s.charAt(i));
		}
		System.out.println(h2);
	}
	

}
