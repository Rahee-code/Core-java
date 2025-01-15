package OOPS;

class Student1
{
	int rno;
	String name;
	String address;
	//non-parameterized
	Student1()
	{
		System.out.println("Non-paramerized");
	}
	//parameterized
	Student1(int r,String n,String a)
	{
		rno=r;
		name=n;
		address=a;
		System.out.println("Rno: "+rno);
		System.out.println("name: "+name);
		System.out.println("Address: "+address);
	}
	
}
public class ConstruMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"john","Mumbai");
	}
}
