package poly;

class A{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
}
class B extends A
{
	@Override
	void sum(int a,int b)
	{
		System.out.println("sum: "+(a+b));
	}
	@Override
	void subtract(int a,int b)
	{
		System.out.println("Subtract: "+(a-b));
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.sum(2, 3);
		b.subtract(5, 1);

	}

}
