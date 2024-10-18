package String;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkDuplicate("java is a programming language");
		System.out.println("------------------------------");
		checkUnique("java is a programming language");

	}
	//duplicate char in String
	public static void checkDuplicate(String s)
	{
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)]++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>1)
			{
				System.out.print((char)i+" ");
			}
		}
		System.out.println();
		
		
	}
	//unique character in String
	public static void checkUnique(String s)
	{
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)]++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				System.out.print((char)i+" ");
			}
		}
		
		
	}

}
