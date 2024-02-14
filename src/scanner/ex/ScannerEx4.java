package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int intValue = scanner.nextInt();
		System.out.println(intValue + "의 구구단을 출력합니다.");
		for(int i=1; i<=9; i++) {
			System.out.println(intValue + " * " + i + " = " + intValue*i);
		}
	}
}
