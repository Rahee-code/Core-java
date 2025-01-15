package Test;

interface S
{
	void show();
}
interface addition
{
	void add(int a,int b);
}
interface subtract
{
	int sub(int a,int b);
}
interface Hello
{
	String greet(String name);
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=()->System.out.println("Show of S Interface");
		addition ad=(a,b)->System.out.println(a+b);
		subtract sb=(a,b)->a-b;
		Hello h=name->"hello "+name;
		
		s.show();
		ad.add(2, 4);
		System.out.println(sb.sub(4, 2));
		System.out.println(h.greet("world"));

	}

}
