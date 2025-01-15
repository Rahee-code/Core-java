package Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//class Thread1 implements Runnable
//{
//	@Override
//	public void run() {
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//		
//	}
//	
//}
class sq implements Function<Integer, Integer>//map(function)
{

	@Override
	public Integer apply(Integer t) {
		// TODO Auto-generated method stub
		return t*t*t;
	}
	
}
class f implements Predicate<Integer>//filter(predicate)
{

	@Override
	public boolean test(Integer t) {
		if(t>2)
		{
			return true;
		}
		return false;
	}
	
}
public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread1 thread=new Thread1();
//		Thread th=new Thread(thread);
//		th.start();
		
//		Runnable rn=()->
//		{
//			for(int i=1;i<=10;i++)
//			{
//				System.out.println(i);
//			}
//		};
//		Thread th=new Thread(rn);
//		th.start();

		//List<Integer> l=List.of(1,2,3,4,5);
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
//		System.out.println("---------------------------");
//		for(Integer i:l)
//		{
//			int sq=i*i;
//			System.out.println(sq);
//		}
//		System.out.println("---------------------------");
//		l.forEach(i->System.out.println(i));
		
		//map and filter
		//map:-when you want to do common operation with each element
		//find the sqaure of each number
		List<Integer> l=List.of(1,2,3,4,5);
		List<Integer> li=l.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(li);
		
		//find the cube
		sq s=new sq();
		List<Integer> li1=l.stream().map(s).collect(Collectors.toList());
		System.out.println(li1);
		System.out.println("filter-----------------------------");
		
		//filter:-conditional op from all the elements
		List<Integer> ff1=l.stream().filter(t->t>2).collect(Collectors.toList());//toList to store multiple elements
		System.out.println(ff1);
		
		f f1=new f();
		List<Integer> ff=l.stream().filter(f1).collect(Collectors.toList());
		System.out.println(ff);
		
		System.out.println("reduce-----------------------------");
		//reduce:-operate on each element and give single output
		int x=l.stream().reduce((a, b)->a+b).get();
		System.out.println(x);
		
		System.out.println("all three-----------------------------");
		//all three in one
		int x1=l.stream().map(i->i*i).filter(t->t>10).reduce((a, b)->a+b).get();
		System.out.println(x1);
		
		System.out.println("max-min-----------------------------");
		int max=l.stream().max((a,b)->a-b).get();
		System.out.println("max: "+max);
		int min=l.stream().min((a,b)->a-b).get();
		System.out.println("min: "+min);
		
		
		
		

	}

}
