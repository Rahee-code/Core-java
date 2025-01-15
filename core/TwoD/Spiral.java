package TwoD;

import java.util.Arrays;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		pritnSpiral(a);
		System.out.println();
		generateSpiral(3);
	

	}
	static void pritnSpiral(int a[][])
	{
		int frow=0;
		int lrow=a.length-1;
		int fcol=0;
		int lcol=a[0].length-1;
		int count=0;
		while(count<a.length*a[0].length)
		{
			//first row
			for(int i=fcol;i<=lcol;i++)
			{
				System.out.print(a[frow][i]);
				count++;
			}
			frow++;
			//last col
			for(int i=frow;i<=lrow ;i++)
			{
				System.out.print(a[i][lcol]);
				count++;
			}
			lcol--;
			//last row
			for(int i=lcol;i>=fcol;i--)
			{
				System.out.print(a[lrow][i]);
				count++;
			}
			lrow--;
			//first col
			for(int i=lrow;i>=frow;i--)
			{
				System.out.print(a[i][fcol]);
				count++;
			}
			fcol++;
		}			
	}
	static void generateSpiral(int n)
	{
		int a[][]=new int[n][n];
		int frow=0;
		int lrow=a.length-1;
		int fcol=0;
		int lcol=a[0].length-1;
		int count=1;
		while(count<=a.length*a[0].length)
		{
			//first row
			for(int i=fcol;i<=lcol;i++)
			{
				a[frow][i]=count;
				count++;
			}
			frow++;
			//last col
			for(int i=frow;i<=lrow ;i++)
			{
				a[i][lcol]=count;
				count++;
			}
			lcol--;
			//last row
			for(int i=lcol;i>=fcol;i--)
			{
				a[lrow][i]=count;
				count++;
			}
			lrow--;
			//first col
			for(int i=lrow;i>=frow;i--)
			{
				a[i][fcol]=count;
				count++;
			}
			fcol++;
		}	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
