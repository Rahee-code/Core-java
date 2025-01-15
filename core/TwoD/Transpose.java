package TwoD;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{4,3,2,1},
				{9,8,7,6}
		};
		//with extra matrix
		int transpose[][]=new int[4][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				transpose[i][j]=a[j][i];
			}
		}
		for(int i=0;i<transpose.length;i++)
		{
			System.out.println(Arrays.toString(transpose[i]));
		}
		System.out.println("without extra space");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j>=i)
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
		
	}

}
