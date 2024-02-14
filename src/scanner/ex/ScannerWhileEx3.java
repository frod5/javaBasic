package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int sum = 0;

		while (true) {
			System.out.print("숫자를 입력하세요. (입력을 중단하려면 -1 입력)");
			int intValue = scanner.nextInt();

			if(intValue == -1) {
				System.out.println("입력한 수의 합계 : " + sum +", 평균: " + (double) sum/i);
				break;
			}

			sum += intValue;
			i++;
		}
	}
}
