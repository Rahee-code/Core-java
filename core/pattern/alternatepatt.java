package pattern;

public class alternatepatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			int value=0;
			if(i%2==0)
			{
				value=0;
			}
			else
			{
				value=1;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(value);
				value=1-value;
			}
			System.out.println();
		}

	}

}
