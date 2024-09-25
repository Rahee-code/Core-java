package OOPS;

class Perfect
{
	static boolean checkP(int n)
	{
		int sum=0,temp=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
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
	static void printPerfect(int st,int end)
	{
		for(int i=st;i<=end;i++)
		{
			if(checkP(i))
			{
				System.out.println(i+" ");
			}
		}
	}
}
public class PerfectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfect p=new Perfect();
		p.printPerfect(1, 1000);

	}

}