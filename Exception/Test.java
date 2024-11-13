package ExceptionHandling;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArithmeticException
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			System.out.println("cannot divide by zero");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		
		//ArrayIndexOutOfBound Exception
//		int a[]= {1,2,3,4,5};
//		for(int i=0;i<=a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		//NullPointer Exception
		String s=null;
		//System.out.println(s.length());
		try {
			if(s!=null) {
				System.out.println(s.length());
			}
			else
			{
				System.out.println("hello");
			}
		} catch (Exception e) {
			System.out.println("exception occuered");
		}
		
		//types of error messages
		try
		{
			divide();
			
			//return;//return method at a point,anything after return is unusable code
			System.exit(0);//finally will not execute
		}
		catch (Exception e) {
			//e.printStackTrace();  return all 3 messages(exception classname,description,line no.
			System.out.println(e.getMessage());//return only description
			System.out.println(e);//e.toString()  return class name with description
		}
		//it is a block that is always execute even if the exception occured or not
		//it is used for writing a clean up code like closing the file,closing the db connection
		//if you want to forcefully stop the finally block use(system.exit(0).
		//even if we write return in try/catch block finally always works.
		finally
		{
			System.out.println("finally block");
		}
		
	}
	static void divide()
	{
		System.out.println(12/2);
	}

}
