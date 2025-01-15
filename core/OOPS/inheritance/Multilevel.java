package OOPS.inheritance;

class Rectangle{
	int length,breadth;
	Rectangle()
	{
		System.out.println("Rectangle class constructor");
	}
	void areaR()
	{
		System.out.println("Area of rect: \n"+(length*breadth));
	}
}
class Triangle extends Rectangle
{
	int height;
	Triangle()
	{
		System.out.println("Triangle class constructor");
	}
	void areaT()
	{
		System.out.println("Area of tri: \n"+(length*breadth*height));
	}
}
class circle extends Triangle
{
	
	circle() {
		System.out.println("circle class constructor");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.length=5;
		c.breadth=3;
		c.height=2;
		c.areaR();
		c.areaT();

	}

}
