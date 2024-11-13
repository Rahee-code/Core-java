package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(3);
		al.add(4);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Employee> a=new ArrayList<Employee>();
		Employee em1=new Employee(1,"john",20000);
		Employee em2=new Employee(3,"john",50000);
		Employee em3=new Employee(2,"kevin",25000);
		a.add(em1);
		a.add(em3);
		a.add(em2);
		Collections.sort(a);//sort with comparable interface for single sorting sequence
		System.out.println(a);
		
		
		//with comparator
		ArrayList<Student> as=new ArrayList<Student>();
		Student s1=new Student(1, "john", 50);
		Student s2=new Student(3, "peter", 75);
		Student s3=new Student(2, "joseph", 60);
		as.add(s3);
		as.add(s2);
		as.add(s1);
		Collections.sort(as,new RnoComaprator());
		System.out.println(as);
		
		ArrayList<Student> as3=new ArrayList<Student>();
		Student s13=new Student(1, "john", 50);
		Student s23=new Student(3, "peter", 75);
		Student s33=new Student(2, "joseph", 60);
		as3.add(s33);
		as3.add(s23);
		as3.add(s13);
		Collections.sort(as3,new RnoComaprator());
		System.out.println(as3);
		
		ArrayList<Student> as1=new ArrayList<Student>();
		Student s11=new Student(1, "john", 50);
		Student s21=new Student(3, "peter", 75);
		Student s31=new Student(2, "joseph", 60);
		as1.add(s31);
		as1.add(s21);
		as1.add(s11);
		Collections.sort(as1,new marksComparator());
		System.out.println(as1);
		

	}

}
