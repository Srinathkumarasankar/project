package busResv;

public class Bus {
	private int busNo;
	private boolean AC;
	private int capacity;
	
Bus(int no , boolean ac , int cap ){
	busNo=no;
	AC=ac;
	capacity=cap;
}
public int getbusNo() {
	return busNo;
}
public boolean getAC() {
	return AC;
	
}
public void setAC(boolean ac) {
	AC=ac;
}
public int getcapacity() {
	return capacity;
}
public void setcapacity(int cap) {
	capacity=cap;
}
public void displaybusinfo(){
	System.out.println( " busNO: " + busNo + " AC: " + AC + " capacity: " + capacity);
}
}
