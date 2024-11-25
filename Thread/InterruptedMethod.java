package Thread;
//note:Thread.interrupted change the interrupt() status to false that's why the code is running without exception
public class InterruptedMethod extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());//return false unless the thread is interrupted again
		System.out.println(Thread.interrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;//return;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedMethod im=new InterruptedMethod();
		im.start();
		im.interrupt();

	}

}
