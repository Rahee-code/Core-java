package TwoD;

import java.util.Scanner;

public class Addition {
	static void addition(int a[][],int b[][])
	{
		int r1=a.length;
		int r2=b.length;
		int c1=a[0].length;
		int c2=b[0].length;
		if(r1!=r2 || c1!=c2)
		{
			System.out.println("addition not possible");
			return;
		}
		int add[][]=new int[r1][c1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				add[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int arr[][]=new int[2][2];
//		int jrr[][]=new int[2][2];
//		int add[][]=new int[2][2];
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				jrr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				add[i][j]=arr[i][j]+jrr[i][j];
//			}
//		}
//		System.out.println("Addition: ");
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(add[i][j]+" ");
//			}
//			System.out.println();
//		}
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]= {
				{7, 4, 1},
				{8, 5, 2},
				{9, 6, 3}
		};
		addition(a, b);

	}

}
