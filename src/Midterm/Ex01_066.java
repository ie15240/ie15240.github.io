import java.util.Scanner;

public class Ex01_066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("초기 예금액을 입력하시오 ");
		double deposit = input.nextDouble();
		System.out.print("연이율을 입력하시오 ");
		double ratio = input.nextDouble();
		
		for (int i=0 ; i<10 ; i++) {
			deposit = calcInterest(deposit, ratio);
			System.out.println((i+1) + "년차 " + deposit + "원");
		}
	}

	public static double calcInterest(double deposit, double ratio) {
		return deposit * (1 + ratio);
	}
}
