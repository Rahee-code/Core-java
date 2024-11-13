package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new LinkedList();
		l1.add(1);
		l1.add(2);
		ArrayList al=new ArrayList(l1);
		al.add(3);
		al.add("java");
		al.add(true);
		al.add(4);
		al.add(5);
		al.add(4,6);
		//System.out.println(al);
		al.remove(2);
		//System.out.println(al.contains("java"));
		al.remove("java");
		addFirst1(al, 0);
		addLast(al, 0);
		System.out.println(al);
		
//		ArrayList al1=new ArrayList();
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2==0)
//			{
//				al1.add(i);
//			}
//		}
//		System.out.println(al1);
		
	}
	static void addFirst1(ArrayList<Integer> a, int element)
	{
		a.add(0,element);
	}
	static void addLast(ArrayList<Integer> a, int element)
	{
		a.add(a.size(),element);
	}

}
