package OOPS;

import java.util.Scanner;

class Prime
{
	static boolean checkPrime(int n)
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
	static void PrintPrime(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("Total prime: "+count);
	}

}

public class PrimeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Prime p=new Prime();
		p.PrintPrime(50, 100);
		
	}

}
