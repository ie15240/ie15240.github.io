import java.util.Scanner;

public class Reservation {
	private Seat[][] s;
	
	public Reservation() {
		s = new Seat[2][10];
		for (int r=0 ; r<2 ; r++) {
			for (int c=0 ; c<10 ; c++) {
				if (r == 0)
					s[r][c] = new Seat(10000, false);
				else
					s[r][c] = new Seat(20000, false);
			}
		}
	}
	
	public void showStatus() {
		for (int r=0 ; r<2 ; r++) {
			for (int c=0 ; c<10 ; c++) {
				if (s[r][c].isReserved())
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	public boolean reserve(int row, int col) {
		if (s[row][col].isReserved()) {
			return false;
		} else {
			s[row][col].reserve();
			return true;
		}
	}
	
	public int getFee(int row, int col) {
		return s[row][col].getFee();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Reservation reservation = new Reservation();
		
		while (true) {
			System.out.print("좌석을 예약하시겠습니까? (1/0) ");
			int finish = input.nextInt();
			if (finish == 0) {
				System.out.println("종료합니다");
				break;
			}
			
			reservation.showStatus();
			
			System.out.println("몇 번 자리를 예약하시겠습니까?");
			int row = input.nextInt();
			int col = input.nextInt();
			if (reservation.reserve(row, col)) {
				System.out.println("예약되었습니다. 가격은 " + reservation.getFee(row, col) + "원입니다.");
			} else {
				System.out.println("예약할 수 없습니다.");
			}
		}
	}
}
