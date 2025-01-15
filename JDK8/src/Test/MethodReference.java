package Test;

interface I
{
	void sum(int a,int b);
}
interface Say
{
	void say();
}
interface message
{
	void msg(String msg);
}
//reference to non-static or instance method
class Hello1
{
	public void say()
	{
		System.out.println("Hello World");
	}
}
//reference to constructor
class Showmsg
{
	public Showmsg(String msg) 
	
	{
		System.out.println(msg);
	}
}
public class MethodReference {
	
	//reference to static method
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sum()
	{
		int sum1=0;
		for(int i=0;i<=5;i++)
		{
			 sum1+=i;
		}
		System.out.println(sum1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reference to static method
		System.out.println("static-------------------------");
		I i=MethodReference::sum;
		i.sum(5, 5);
		
		Runnable rn=MethodReference::sum;
		Thread th=new Thread(rn);
		th.start();
		
		System.out.println("instance-------------------------");
		//reference to non-static or instance method
		Hello1 h1=new Hello1();
		Say s=h1::say;
		s.say();
		
		System.out.println("constructor-------------------------");
		message ms=Showmsg::new;
		ms.msg("hello");
		

	}

}

