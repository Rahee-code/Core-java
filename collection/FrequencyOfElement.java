package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfElement {

	public static void main(String[] args) {
		//Find the frequency of each element in an array
		int arr[]={1,2,3,2,5,7,3,4,4,2,8};
		calculateFrequencyInArray(arr);
		calculateFrequencyInString("Leetcode");
		System.out.println(firstNonRepeatingChar("geeksforgeeks"));
		TreeMap();
		}
	static void calculateFrequencyInArray(int arr[])
	{
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i]))
			{
				int value=h.get(arr[i]);
				h.put(arr[i], value+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
		}
		System.out.println(h);
		//find the duplicate elements in an array
		for(Map.Entry<Integer, Integer>m:h.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
	}
	static void calculateFrequencyInString(String s)
	{
		HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 
        {
            String key = Character.toString(s.charAt(i));
            if (h.containsKey(key)) 
            {
                int value = h.get(key);
                h.put(key, value + 1);
            } else 
            {
                h.put(key, 1);
            }
        }
        System.out.println(h);
        for(Map.Entry<String, Integer>m:h.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
	}
	static String firstNonRepeatingChar(String s)
	{
		String ans="$";
		LinkedHashMap<String, Integer> h = new LinkedHashMap();
        for (int i = 0; i < s.length(); i++) 
        {
            String key = Character.toString(s.charAt(i));
            if (h.containsKey(key)) 
            {
                int value = h.get(key);//returns value
                h.put(key, value + 1);
            } else 
            {
                h.put(key, 1);
            }
        }
        System.out.println(h);
        for(Map.Entry<String, Integer>m:h.entrySet())
		{
			if(m.getValue()==1)
			{
				ans=m.getKey();
				break;
			}
	
		}
        return ans;
	}
	static void TreeMap()
	{
		TreeMap<Integer,Integer> t=new TreeMap();
		t.put(1, 10);
		t.put(2, 20);
		t.put(3, 30);
		t.put(5, null);
		t.put(4, 10);
		System.out.println(t);
	}
	
	

}
