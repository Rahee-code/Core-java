package OOPS;

class Parent
{
	static class Child
	{
		static class Subchild
		{
			static void sum()
			{
				System.out.println("sum of subchild");
			}
		}
		static void display()
		{
			System.out.println("Display");
		}
	}
}
public class NestedStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent p=new Parent();
//		Parent.Child c=p.new Child();
//		Parent.Child.Subchild sb=c.new Subchild();
//		c.display();
//		sb.sum();
		Parent.Child.display();
		Parent.Child.Subchild.sum();
	}

}
