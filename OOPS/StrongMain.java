package OOPS;

class Strong
{
	static boolean checkStrong(int n)
	{
		int sum=0,temp=n;
		while(n>0)
		{
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
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
	static void printStrong(int st,int end)
	{
		for(int i=st;i<=end;i++)
		{
			if(checkStrong(i))
			{
				System.out.println(i+" ");
			}
		}
	}
}
public class StrongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong st=new Strong();
		st.printStrong(1, 200);

	}

}