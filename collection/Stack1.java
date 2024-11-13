package Collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.add(3);
		s.add("java");
		System.out.println(s);
		System.out.println("peek: "+s.peek());
		System.out.println("pop: "+s.pop());
		System.out.println(s);
		System.out.println("Search(1): "+s.search(1));//return position from top
		System.out.println("Search(java): "+s.search("java"));
	}

}
