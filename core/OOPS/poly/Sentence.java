package OOPS.poly;

class Add
{
	void sum(int... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	void printSen(String... words)
	{
		String Sentence=" ";
		for(int i=0;i<words.length;i++)
		{
			Sentence+=words[i]+" ";
		}
		System.out.println(Sentence);
	}
}

public class Sentence {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ad=new Add();
		ad.printSen("java","is","a","programming","Language");
		ad.sum(10,20,30,40);

	}

}
