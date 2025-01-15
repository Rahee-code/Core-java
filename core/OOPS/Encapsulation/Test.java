package OOPS.Encapsulation;

class Car{
	private int wheel=4;
	private int door=4;
	private int engine=1;
	private int max_speed=80;
	private String mileage="15km/L";
	private String price="25L";
	
	public int getWheel()
	{
		return wheel;
	}
	public void setWheel(int wheel)
	{
		if(wheel==4)
		{
			this.wheel=wheel;
		}
		
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		if(door==4)
		{
			this.door = door;
		}
	
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		if(engine==1)
		{
			this.engine = engine;
		}
		
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		if(max_speed==80||max_speed==90)
		{
			this.max_speed = max_speed;
		}
		
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		if(mileage.equals("15km/L")||mileage.equals("20km/L"))
		{
			this.mileage = mileage;
		}
		
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		if(price.equals("20lk")||price.equals("25lk"))
		{
			this.price = price;
		}
	
	}
	void getDetails()
	{
		System.out.println("Wheels: "+wheel);
		System.out.println("Door: "+door);
		System.out.println("Engine: "+engine);
		System.out.println("Max-speed: "+max_speed);
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.setPrice("200l");
		c.setDoor(5);
		c.setWheel(6);
		c.getDetails();

	}

}
