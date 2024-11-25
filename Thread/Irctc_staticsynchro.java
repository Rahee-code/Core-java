package Thread;

class BookTicket1 
{
	static int totalseats=20;
	static synchronized void  bookSeat(int seat)
	{
			if(seat<=totalseats) 
			{
				System.out.println(seat+" Seats booked successfully");
				totalseats=totalseats-seat;
				System.out.println("Remaining seats are: "+totalseats);
			}
			else
			{
				System.out.println("Booking canceled");
				System.out.println("Remaining seats are: "+totalseats);
			}
	}
}
class Thread1 extends Thread{
	BookTicket1 b;
	int seat;
	public Thread1(BookTicket1 b,int seat) {
		this.b=b;
		this.seat=seat;
		
	}
	@Override
	public void run() {
		BookTicket1.bookSeat(seat);
	}
}
class Thread2 extends Thread{
	BookTicket1 b;
	int seat;
	public Thread2(BookTicket1 b,int seat) {
		this.b=b;
		this.seat=seat;
		
	}
	@Override
	public void run() {
		BookTicket1.bookSeat(seat);
	}
}
class Thread3 extends Thread{
	BookTicket1 b;
	int seat;
	public Thread3(BookTicket1 b,int seat) {
		this.b=b;
		this.seat=seat;
		
	}
	@Override
	public void run() {
		BookTicket1.bookSeat(seat);
	}
}
public class Irctc_staticsynchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTicket1 b=new BookTicket1();
		BookTicket1 b1=new BookTicket1();
		Thread1 t1=new Thread1(b,3);
		Thread2 t2=new Thread2(b1,4);
		Thread3 t3=new Thread3(b,13);
		t1.start();
		t2.start();
		t3.start();
		
		
		

	}

}
