package Test;

interface A
{
	default void show()
	{
		System.out.println("show of A");
	}
	default void run()
	{
		System.out.println("run of A");
	}
}
class BA
{
	public void show()
	{
		System.out.println("show of class");
	}
}
interface B
{
	default void run()
	{
		System.out.println("run of B");
	}
}
interface C
{
	static void run()
	{
		System.out.println("run of C");
	}
}
//interface D{           //cannot use default &static for object class method in interface
//	@Override
// boolean equals(Object o)
//{
//	return true;
//}
//}
public class Test extends BA implements A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		test.show();
//		test.run();
//		C.run();

	}

//	@Override
//	public void show() {
//		System.out.println("Show method of A");
//		
//	}

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		B.super.run();
//	}
	

}
