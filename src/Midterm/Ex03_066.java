import java.util.Scanner;

public class Ex03_066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("암호키를 입력하시오 ");
		int k = input.nextInt();
		System.out.print("영문자를 입력하시오 ");
		char alphabet = input.next().charAt(0);

		while (alphabet >= 'a' && alphabet <= 'z') {
			System.out.println(alphabet + "->" + encryption(alphabet, k));
			System.out.print("영문자를 입력하시오 ");
			alphabet = input.next().charAt(0);
		}
		
		System.out.print("프로그램 종료");
	}
	
	public static char encryption(char c, int k) {
		return (char)(((c - 'a' + k) % 26) + 'a');
	}

}
