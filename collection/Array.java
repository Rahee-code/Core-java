package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {1,2,3,4,5,6,0};
//		System.out.println(Arrays.toString(a));
//		int pos=2;
//		for(int i=a.length-2;i>=pos;i--)
//		{
//			a[i+1]=a[i];
//		}
//		a[pos]=7;
//		System.out.println(Arrays.toString(a));
//		
//		System.out.println();
//		
//		add(1, 7, a);
//		System.out.println(Arrays.toString(a));
//		System.out.println();
//		int ab[]= {0,1,2,3,4,5,6};
//		System.out.println(Arrays.toString(ab));
//		int pos1=2;
//		for(int i=0;i<=pos1;i++)
//		{
//			ab[i]=ab[i+1];
//		}
//		ab[pos1]=7;
//		System.out.println(Arrays.toString(ab));
		maximum();
		
	}
	static void add(int pos, int element,int arr[])
	{
		for(int i=arr.length-2;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=element;
	}
	static void maximum()
	{
		//find max in array
		int arr[]= {8,4,23,12,45,7,21,45};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max: "+max);
		//find second max with for
		int max1=arr[0],ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				ans=max1;
				max1=arr[i];
			}
		}
		System.out.println("Second lagest with for: "+ans);
				
		//find second max in array with Arrays
		//this method does not work in duplicacy
		Arrays.sort(arr);
		System.out.println("second largest with Arrays: "+arr[arr.length-2]);
		
		//find second max in array with TreeSet
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			t.add(arr[i]);
		}
		ArrayList<Integer> al=new ArrayList<Integer>(t);
		System.out.println("Second largest with Treeset: "+al.get(al.size()-2));
		
		
		//find the kth largest element in an an Array
		//with priority queue
		Queue q=new PriorityQueue();
		int k=3;
		for(int i=0;i<k;i++)
		{
			q.add(arr[i]);// add first 3 elements in queue //tree structure
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>(int)q.peek())
			{
				q.poll();
				q.add(arr[i]);//remove peek element and add greater element
			}
		}
		System.out.println("kth largest with priority queue: "+q.peek());
		
		//find the kth smallest element in an an Array
		//with priority queue
		Queue q1=new PriorityQueue(Collections.reverseOrder());
		int k1=1;
		for(int i=0;i<k1;i++)
		{
			q1.add(arr[i]);// add first 3 elements in queue //tree structure
		}
		for(int i=k1;i<arr.length;i++)
		{
			if(arr[i]<(int)q1.peek())
			{
				q1.poll();
				q1.add(arr[i]);//remove peek element and add greater element
			}
		}
		System.out.println("kth smallest with priority queue: "+q1.peek());
		
		
	}

}
