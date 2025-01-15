package OOPS;

class A1
{
	int x;
	int y;
	A1()
	{
		this.x=5;
		this.y=10;
		System.out.println("default constructor");
	}
	A1(int a,int b)
	{
		this.x=a;
		this.y=b;
		System.out.println("parameterised constructor");
	}
	A1(A1 a)
	{
		x=a.x;
		y=a.y;
		System.out.println("Copy Constructor");
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	@Override
	public String toString() {
		return "A1 [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
//		System.out.println(a.x);
//		System.out.println(a.y);
//		System.out.println(a);
//		a.display();
//		
//		A1 b=new A1(15,20);
//		System.out.println(b.x);
//		System.out.println(b.y);
		//System.out.println(b);
//		b.display();
		
		A1 c=new A1(a);
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c);
		
		
		

	}

	

}
