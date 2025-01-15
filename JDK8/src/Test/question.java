package Test;

import java.util.List;
import java.util.stream.Stream;

public class question {

	//print 122333444455555
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		}
		
		//find max without max() function
		List<Integer> l=List.of(1,3,7,5,4);
		Stream<Integer> x=l.stream().sorted().skip(l.size()-1).limit(1);
		List<Integer> li=x.toList();
		System.out.println(li);
		
	}

}
