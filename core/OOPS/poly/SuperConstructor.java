package OOPS.poly;

class Rectangle
{
	int length,breadth;
	public Rectangle() {
		System.out.println("Default");
	}
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	void areaOfRect()
	{
		System.out.println(length*breadth);
	}
}
class Triangle extends Rectangle
{
	int height;
	
	Triangle(int length,int breadth,int height)
	{
		super(length,breadth);
		this.height=height;
		
	}
	void areaOfTri()
	{
		System.out.println(length*breadth*height);
		super.areaOfRect();
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle(2,4,6);
		t.areaOfTri();
		

	}

}
