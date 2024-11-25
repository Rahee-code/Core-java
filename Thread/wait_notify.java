package Thread;

class TotalIncome extends Thread
{
	int totalearning=0;
	public void run()
	{
		synchronized (this) {
			for(int i=1;i<=10;i++)
			{
				totalearning+=100;
			}
			this.notify();
		}
	}
}
public class wait_notify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TotalIncome ti=new TotalIncome();
		ti.start();
		synchronized (ti) {
			ti.wait();
			System.out.println("Income: "+ti.totalearning);
		}

	}

}
