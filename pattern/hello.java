package pattern;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=0;i<=n;i++)
		{
			for(int sp=n-i;sp>=1;sp--)
			{
				System.out.print("  ");
			}
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
