package TwoD;

public class UpperDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		upper(a, 3);
		int b[][]= {
				{1,2,3,4},
				{4,5,6,5},
				{7,8,9,6},
				{3,4,2,1}
		};
		lower(b, 4);

	}
	
	  static void upper(int a[][],int n) 
	  {
		  int[][] matrix = new int[n][n];
	        System.out.println("Upper Diagonal Matrix:");
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = 0; j < n; j++) 
	            {
	                if (i <= j)
	                {
	                   matrix[i][j]=a[i][j];
	                } 
	                else 
	                {
	                   matrix[i][j]=0;
	                }
	            }
	           
	        }
	        for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[i].length;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
	        
	      
	    }
	  static void lower(int a[][],int n) 
	  {
		  int[][] matrix = new int[n][n];
		  System.out.println("Upper Diagonal Matrix:");
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = 0; j < n; j++)
	            {
	                if (i <= j) 
	                {
	                   matrix[i][j]=a[i][j];
	                }
	                else 
	                {
	                   matrix[i][j]=0;
	                }
	            }
	        }
	        for(int i=0;i<matrix.length;i++)
			{
				for(int j=0;j<matrix[i].length;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
	    }
}
