package pattern;

public class Numpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(int sp=1;sp<=i-1;sp++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=5-i;j++)
			{
				System.out.print(j);
			}
			for(int k=4-i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();

	}

}
}
