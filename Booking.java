package busResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	private String passengerName;
	private int busNo;
	private Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Passenger Name:");
		passengerName=scanner.next();
		System.out.println("Enter busNO:");
		busNo=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateinput=scanner.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateinput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
		public  boolean isAvailable(ArrayList<Bus>buses, ArrayList<Booking>bookings) {
			int capacity=0;
			for(Bus b:buses) {
			if(b.getbusNo()==busNo) {
				capacity=b.getcapacity();
				}
			}
			int booked=0;
			for(Booking c:bookings) {
				if(c.busNo==busNo && c.date.equals(date)) {
				booked++;
				}
				}
			return booked<capacity?true:false;
			}
			
			
	}
		
		
			


