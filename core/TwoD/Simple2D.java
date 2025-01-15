package TwoD;

import java.util.Arrays;
import java.util.Scanner;

public class Simple2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int arr[][]=new int[4][4];
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		//print 2D
////		for(int i=0;i<arr.length;i++)
////		{
////			System.out.println(Arrays.toString(arr[i]));
////		}
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{4,3,2,1},
				{9,8,7,6}
		};
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[j][i];
			}
			System.out.println(sum);
		}
		

	}

}
