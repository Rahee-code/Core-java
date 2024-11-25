package Thread;

public class Test extends Thread{
	@Override
	public void run()
	{
		System.out.println("run method of thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		Test t=new Test();
		t.start();
		
	}

}
