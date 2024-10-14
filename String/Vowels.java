package String;

public class Vowels {

	public static void main(String[] args) {
		// Find vowels in a string
		String s1="java is a programming language";
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				System.out.print(s1.charAt(i)+" ");
			}
		}
		int a=10;
		int b=10;
		System.out.println(a==b);
		String s2="java";
		String ss="java";
		System.out.println(s2==ss);
		String s11=new String("java");
		String s12=new String("java");
		System.out.println(s11.equals(s12));

	}

}
