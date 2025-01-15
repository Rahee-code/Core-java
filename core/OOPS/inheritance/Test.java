package OOPS.inheritance;

class A
{
	int x=5;
	void printX()
	{
		System.out.println(x);
	}
}
class B extends A{
	int y=10;
	void printY()
	{
		System.out.println(y);
	}
}
public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*By creating the child class object we can access  the properties of a 
		 * parent class but by creating the parent,s class object we can not access the 
		 * properties of child class. 
		 */
//		A a=new A();
//		System.out.println(a.x);
//		a.printX();
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.y);
		b.printX();
		b.printY();
	}

}
