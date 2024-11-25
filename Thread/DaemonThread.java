package Thread;

class Test3 extends Thread
{
	@Override
	public void run() {
		System.out.println("run()");
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 t=new Test3();
		t.setDaemon(true);
		t.start();
		System.out.println("main thread: "+Thread.currentThread().isDaemon());
		System.out.println(t.isDaemon());
	}

}
