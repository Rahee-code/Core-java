package OOPS;

import java.util.Scanner;

class Prime1
{
	boolean checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		Prime p=new Prime();
		System.out.println(p.checkPrime(num));
	}

}
//class Prime
//{
//	boolean checkPrime(int n)
//	{	
//		int temp=0;
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				temp+=1;
//			}
//		}
//		if(temp>2)
//		{
//			System.out.println(temp);
//			return false;
//		}
//		else 
//		{
//			return true;
//		}
//	}
//}
