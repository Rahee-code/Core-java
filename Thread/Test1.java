package Thread;

public class Test1 extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		Test1 t1=new Test1();
		Thread th=new Thread(t1);//parameterized constructor
		th.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method of Runnable interface");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Run2");
		
	}

}
