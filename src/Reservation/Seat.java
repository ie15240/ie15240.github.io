
public class Seat {
	private int fee;
	private boolean isReserved;
	
	public Seat(int fee, boolean isReserved) {
		this.fee = fee;
		this.isReserved = isReserved;
	}
	
	public boolean isReserved() {
		return isReserved;
	}
	
	public void reserve() {
		isReserved = true;
	}
	
	public int getFee() {
		return fee;
	}
}
