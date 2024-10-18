package String;

public class Longest_nonRepeat_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestSubWithoutRepeat("abcdea");

	}
	public static void longestSubWithoutRepeat(String s)
	{
		String sub="",ans="";
		int maxlength=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				sub=s.substring(i,j+1);
				if(checkDuplicate(sub))
				{
					ans+=sub+" ";
					maxlength=Math.max(maxlength, sub.length());
				}
			}
		}
		System.out.println("Maximum length without repeating: "+maxlength);
	}
	public static boolean checkDuplicate(String s)
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
			String ans="";
			if(a[i]>1)
			{
				return false;
				
			}
			
		}
		return true;
	}

}
