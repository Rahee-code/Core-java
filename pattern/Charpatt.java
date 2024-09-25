package pattern;

public class Charpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{
			for(j='A';j<='A'+5-i;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		
		
		char value='A';
		int count=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(count%2==0)
				{
					System.out.print((char)(value+32)+" ");
				}
				else
				{
					System.out.print(value+" ");
				}
				count++;
				value++;
			}
			System.out.println();
		}

	}

}
