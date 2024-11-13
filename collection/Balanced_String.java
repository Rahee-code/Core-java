package Collection;

import java.util.Stack;

public class Balanced_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="[()]{}";
		String s2="[(])";
		String s3=")[](";
		System.out.println(checkPara(s1));
	}
	public static boolean checkPara(String s1)
	{
		Stack s=new Stack();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='{'||s1.charAt(i)=='['||s1.charAt(i)=='(')
			{
				s.push(s1.charAt(i));
			}
			else {
				if(s.empty())
				{
					return false;
				}
				char ch=(char)s.peek();
				if(((ch=='('&& s1.charAt(i)==')')||
					(ch=='{'&& s1.charAt(i)=='}')||
					(ch=='['&& s1.charAt(i)==']')))
				{
					s.pop();
				}
				else
				{
					return false;
				}
			}
		}
		if(s.empty())
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}

}
