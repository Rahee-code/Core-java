package String;

public class LongestLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 CheckLength("java is a programming language");

	}
	public static void CheckLength(String s)
	{
		String a[]=s.split(" ");
		String str="",ans="";
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>max)
			{
				max=a[i].length();
				ans=a[i];
			}
		}
		System.out.println(ans+":-"+max);
				
		
		
	}
}
