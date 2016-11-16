import java.util.Scanner;

public class Ex01_067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("높이를 입력하시오 ");
		int h = input.nextInt();
		
		for (int i=0 ; i<h ; i++) {
			for (int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for (int j=0 ; j<2*(h-i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		double area = h * h / Math.sqrt(3);
		System.out.println("정삼각형의 넓이: " + area);
	}
}
