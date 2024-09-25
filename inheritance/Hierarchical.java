package inheritance;

class A1
{
	int a=10;
}
class B1 extends A1
{
	int b=20;
}
class C extends A1
{
	int c=30;
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b=new B1();
		System.out.println(b.a);
		System.out.println(b.b);
		C c=new C();
		System.out.println(c.a);
		System.out.println(c.c);
	}

}
