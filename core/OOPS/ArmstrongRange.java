package OOPS;

class Arm
{
	static int pow(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	static boolean checkArm(int n)
	{
		int temp=n,p=pow(n);
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=(int) (sum+Math.pow(d, p));
			n=n/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	static void PrintArm(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(checkArm(i))
			{
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("Total Armstrong: "+count);
	}

}

public class ArmstrongRange {

	public static void main(String[] args) {
		Arm p=new Arm();
		p.PrintArm(0, 5);
		
	}

}
