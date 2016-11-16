import java.util.Scanner;

public class Ex02_066 {

	public static void main(String[] args) {
		double urban, express, efficiency;
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.print("도심 연비를 입력하시오 ");
		urban = input.nextDouble();
		System.out.print("고속도로 연비를 입력하시오 ");
		express = input.nextDouble();
		
		efficiency = urban * 0.45 + express * 0.55;
		System.out.println("연비: " + efficiency);
		if (efficiency >= 16) {
			grade = 1;
		} else if (efficiency >= 13.8) {
			grade = 2;
		} else if (efficiency >= 11.6) {
			grade = 3;
		} else if (efficiency >= 9.4) {
			grade = 4;
		} else {
			grade = 5;
		}
		System.out.println("등급: " + grade + "등급");
	}

}
