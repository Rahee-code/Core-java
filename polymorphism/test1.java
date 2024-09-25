package poly;

class Sum
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
class Vehicle
{
	String movement;
	
	void movement(int a) {
		if(movement.equals("road"))
		{
			System.out.println("Running");
		}
	}
	void movement(int a,int b) {
		if(movement.equals("water"))
		{
			System.out.println("Sailing");
		}
	}
	void movement(int a,int b,int c)
	{
		if(movement.equals("sky"))
		{
			System.out.println("flying");
		}
	}
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		s.sum(10, 20);
		s.sum(20, 30, 10);
		Vehicle v=new Vehicle();
		v.movement="sky";
		v.movement(7, 8,9);

	}

}
