package Thread;

class thread extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread());
	}
}
public class Thread_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread t1=new thread();
		t1.start();
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("isAlive "+t1.isAlive());
		System.out.println(Thread.currentThread());//main thread
		System.out.println("isAlive(main) "+Thread.currentThread().isAlive());
		System.out.println("Name: "+Thread.currentThread().getName());
		Thread.currentThread().setName("MainThread");//change the name of main method thread
		System.out.println("Name: "+Thread.currentThread().getName());
		
	}

}
