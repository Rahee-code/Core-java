package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m =new HashMap();
		m.put(1, "A");
		m.put(2, "A"); 
		m.put(null, null);
		m.put(3, null);
		m.put(4, "B");
		m.put("java", 5);
		m.put(5, null);
		m.putIfAbsent(5, "5");
		System.out.println(m);

	}

}
