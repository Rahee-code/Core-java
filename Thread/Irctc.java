package Thread;

class BookTicket 
{
	int totalseats=20;
	public void  bookSeat(int seat)//synchronized method
	{
		synchronized (this) {//synchronized block
			if(seat<=totalseats|| totalseats!=0) 
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
	
}
public class Irctc extends  Thread{
	 static BookTicket b;
	 int seat;
	 @Override
	public void run() {
		b.bookSeat(seat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new BookTicket();
		Irctc i1=new Irctc();
		i1.seat=15;
		i1.start();
		Irctc i2=new Irctc();
		i2.seat=5;
		i2.start();
		Irctc i3=new Irctc();
		i3.seat=5;
		i3.start();

	}

}
