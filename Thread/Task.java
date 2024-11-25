package Thread;

//performing single task from single thread
//performing single task from multiple thread
class TTask extends Thread{
	@Override
	public void run()
	{
		System.out.println("run of TTask class");
	}
}
//performing multiple task from single thread
//performing multiple task from multiple thread
class Task1 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run of Task1");
	}
}
class Task2 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run of Task2");
	}
}
class Task3 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run of Task3");
	}
}
public class Task {

	public static void main(String[] args) {
		//performing single task from single thread
		//performing single task from multiple thread
		TTask tt=new TTask();
		tt.start();
		TTask tt1=new TTask();
		tt1.start();
		//performing multiple task from multiple thread
		Task1 t1=new Task1();
		t1.start();
		Task2 t2=new Task2();
		t2.start();
		Task3 t3=new Task3();
		t3.start();

	}

}
