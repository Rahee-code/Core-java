package OOPS;

class Stud
{
	int rno;
	String name;
	String address;
	int age;
	final String collage_name="MLDC";
	Stud(int rno,String name,String address,int age)
	{
		this.rno=rno;
		this.name=name;
		this.address=address;
		this.age=age;
		
	}
	void getValue()
	{
		System.out.println("Rno: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("age: "+age);
		System.out.println("Collage: "+collage_name);
		System.out.println("-------------------------------");
	}
}
//static method cannot be overridden
class A
{
	static void sum()
	{
		System.out.println("method of A");
	}
	static void sum(int a)//overload
	{
		System.out.println("parameter method of A");
	}
}
class B extends A
{
	//@Override
	static void sum()
	{
		System.out.println("method of B");
	}
}
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s1=new Stud(1,"Neha","Mumbai",20);
		s1.getValue();
		Stud s2=new Stud(2,"vishal","andheri",25);
		s2.getValue();

	}

}
