package OOPS;
class Student
{
	int rno;
	String name;
	String address;
	void setValue(int r,String n,String a)
	{
		rno=r;
		name=n;
		address=a;
	}
	void getValue()
	{
		System.out.println("Roll no.: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setValue(1, "Sumit", "Mumbai");
		s1.getValue();
		System.out.println();
//		s1.rno=1;
//		s1.name="Pooja";
//		s1.address="Mumbai";
//		System.out.println(s1.rno);
//		System.out.println(s1.name);
//		System.out.println(s1.address);

		
		Student s2=new Student();
		s2.setValue(2, "John", "Pune");
		s2.getValue();
		System.out.println();
//		s2.rno=2;
//		s2.name="John";
//		s2.address="Pune";
//		System.out.println(s2.rno);
//		System.out.println(s2.name);
//		System.out.println(s2.address);
		Student s3=new Student();
		s3.setValue(3, "Pooja", "Thane");
		s3.getValue();
	}

}
