package TwoD;

import java.util.Arrays;

public class Rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
					};
		rotateBy90(a);
		
		}
		public static void transposeInPlace(int a[][])
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(j>=i)
					{
						int temp1=a[i][j];
						a[i][j]=a[j][i];
						a[j][i]=temp1;
					}
				}
			}
		}
		static void reverse(int a[])
		{
			int s=0;
			int e=a.length-1;
			while(s<e)
			{
				int temp=a[s];
				a[s]=a[e];
				a[e]=temp;
				s++;
				e--;
			}
		}
		static void rotateBy90(int a[][])
		{
			transposeInPlace(a);
			for(int i=0;i<a.length;i++)
			{
				reverse(a[i]);
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(Arrays.toString(a[i]));
			}
		}
		
		

	

}
