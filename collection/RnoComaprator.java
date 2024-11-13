package Collection;

import java.util.Comparator;

public class RnoComaprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getRno()-o2.getRno();
	}

	

	

}
