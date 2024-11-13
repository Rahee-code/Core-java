package Collection;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new PriorityQueue();//minheap by default
		q.add(1);
		q.add(1);
		q.offer(2);
		q.offer(2);
		System.out.println("Peek: "+q.peek());
		q.poll();
		q.remove(2);
		System.out.println(q.element());
		System.out.println(q);
		
		System.out.println("----------------");
		Queue q1=new PriorityQueue(Collections.reverseOrder());//maxheap  (deafult in c++)
		q1.add(1);
		q1.add(1);
		q1.offer(2);
		q1.offer(2);
		System.out.println("Peek: "+q1.peek());
		System.out.println(q1);
	}

}
