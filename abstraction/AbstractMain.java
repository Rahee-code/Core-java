package OOPS.Abstraction;

abstract class  Admin
{
	abstract void addProduct();
	void getDetails()
	{
		System.out.println("Details");
	}
}
class Adminimpl extends Admin//implementation of abstract method in class
{
	@Override
	void addProduct() {
		System.out.println("Product");
		
	}
	
}
//multiple inheritance with interface
interface User
{
	int x=5;//by default variables are static final in interface
	void addProfile();
}
interface User1
{
	int x=10;
	void addProfile();
}
class Userimpl implements User,User1
{
	public void addProfile()//interface abstract method have "public" modifier
	{
		System.out.println("Profile");
	}
}
 

































public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adminimpl ad=new Adminimpl();
		ad.addProduct();
		ad.getDetails();
		//reference    //inherited class(object)
		User u  =  new   Userimpl();
		u.addProfile();
		System.out.println(u.x);

	}

}
