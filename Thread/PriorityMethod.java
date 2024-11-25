package Thread;

public class PriorityMethod extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+","+i);
		}
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Priority: "+Thread.currentThread().getPriority()+
				"\nName: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("hello");
		PriorityMethod pm=new PriorityMethod();
		pm.start();
		System.out.println("Priority: "+Thread.currentThread().getPriority()+
				"\nName: "+Thread.currentThread().getName());
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+","+i);
		}

	}

}
