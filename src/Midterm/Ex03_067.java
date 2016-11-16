import java.util.Scanner;

public class Ex03_067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("현재 사자 개체수를 입력하시오 ");
		int lions = input.nextInt();
		System.out.print("현재 사슴 개체수를 입력하시오 ");
		int deers = input.nextInt();
		
		for (int i=0 ; i<10 ; i++) {
			int nLions = numberOfLions(lions, deers);
			int nDeers = numberOfDeers(lions, deers);
			System.out.println((i+1) + "년후 사자: " + nLions + " 사슴: " + nDeers);
			lions = nLions;
			deers = nDeers;
		}
	}

	public static int numberOfLions(int lions, int deers) {
		return (int)(lions * 0.86 + deers * 0.08);
	}
	
	public static int numberOfDeers(int lions, int deers) {
		return (int)(deers * 1.14 - lions * 0.12);
	}
}
