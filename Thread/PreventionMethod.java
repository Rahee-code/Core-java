package Thread;

public class PreventionMethod extends Thread {
	static Thread m;//instance variable to store main method instance
	@Override
	public void run() {
		Thread.yield();
		try {
			m.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=3;i++)   
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m=Thread.currentThread();
		PreventionMethod pm= new PreventionMethod(); 
		pm.start();
//		try {
//			pm.join(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=1;i<=3;i++)   
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}

	}

}
