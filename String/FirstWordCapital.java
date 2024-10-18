package String;

public class FirstWordCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CaptializeFirsrWord("jAva is a ProgrammIng language"));
	}
	public static String CaptializeFirsrWord(String a)
	{
		a=a.toLowerCase();
		String ab[]=a.split(" ");
		String str="";
		for(int i=0;i<ab.length;i++)
		{
			str+=capitalWord(ab[i])+" ";
		}
		return str;
		
	}
	public static String capitalWord(String s)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			if(i==0 || i==s.length()-1)//first and last character is caps
			{
				ans+=(char)(s.charAt(i)-32);
			}
			else
			{
				ans+=(char)(s.charAt(i));
			}
		}
		return ans;
	}

}
