package busResv;
import java.util.*;
public class Busdemo {
public static void main(String args[]) {
	System.out.println("Welcome to Volvo Bus Reservation ");
	ArrayList<Bus>buses=new ArrayList<Bus>();
	ArrayList<Booking>bookings=new ArrayList<Booking>();
	buses.add(new Bus(1,true,2));
	buses.add(new Bus(2,true,45));
	buses.add(new Bus(3,false,52));
	int user=1;
	Scanner scanner=new Scanner(System.in);
	for(Bus b:buses) {
		b.displaybusinfo();}
	while(user==1) {
		System.out.println("Enter '1' for Booking '2' for Exit ");
		user=scanner.nextInt();
		if(user==1) {
			Booking booking=new Booking();
		
		if(booking.isAvailable(buses,bookings)){
			bookings.add(booking);
			System.out.println("Your Booking is confirmed");
			}
			else
			System.out.println("Sorry Bus is Full Try another busNo or Date");
		}
		
		
			
		
	}
	
	
}
}