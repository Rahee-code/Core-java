package String;

public class SubString {
	//SubString is a continuous part of a string
	//substring method always exclude the last index of string
	public static void main(String[] args) {
		generateSubString("java");

	}
	public static void generateSubString(String s) {
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				//without built-in
				for(int k=i;k<=j;k++)
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
				//System.out.print(s.substring(i,j+1)+" ");
			}
		}
	}
}
