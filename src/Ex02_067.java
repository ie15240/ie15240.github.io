import java.util.Scanner;

public class Ex02_067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("전력사용량을 입력하시오 ");
		double kwh = input.nextDouble();
		
		double fee;
		if (kwh <= 100) {
			fee = 410 + 60.7 * kwh;
		} else if (kwh <= 200) {
			fee = 910 + 60.7 * 100 + 125.9 * (kwh % 100);
		} else if (kwh <= 300) {
			fee = 1600 + 60.7 * 100 + 125.9 * 100 + 187.9 * (kwh % 100);
		} else if (kwh <= 400) {
			fee = 3850 + 60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 280.6 * (kwh % 100);
		} else if (kwh <= 500) {
			fee = 7300 + 60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 280.6 * 100 + 417.7 * (kwh % 100);
		} else {
			fee = 12940 + 60.7 * 100 + 125.9 * 100 + 187.9 * 100 + 280.6 * 100 + 417.7 * 100 + 709.5 * (kwh % 100);
		}
		
		System.out.println("전기요금: " + fee + "원");
	}

}
