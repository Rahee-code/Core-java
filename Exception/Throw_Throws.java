package ExceptionHandling;

import java.util.Scanner;

//checked exceptions or compile time exceptions extends Exception class
//unchecked exceptions or runtime exception extends RuntimeException class
//whenever we need to create a custom exception that time we mostly prefer to create runtime or unchecked exception

class VoteException extends RuntimeException
{
	public VoteException(String msg) 
	{
		super(msg);
	}
}
public class Throw_Throws {

//	static void checkAge(int age) {
//	    if (age < 18) {
//	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//	    }
//	    else {
//	      System.out.println("Access granted - You are old enough!");
//	    }
//	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkAge(25); // Set age to 15 (which is below 18...)
		
		//throw keyword
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter age: ");
				int age=sc.nextInt();
			    if(age<18)
			    {
				    try
				    {
				    	throw new VoteException("You are not eligible to vote");
				    	//in same block after throw you cannot write anything
				    }
				    catch (VoteException e) {
				    	e.printStackTrace();
				    	//System.out.println(e.getMessage());
					}
			    }
			    else
			    {
			    	System.out.println("you can vote");
			    }

	}

}
