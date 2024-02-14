package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번쨰 숫자를 입력하세요: ");
			int num1 = scanner.nextInt();
			System.out.print("두 번쨰 숫자를 입력하세요: ");
			int num2 = scanner.nextInt();

			if(num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료!!");
				break;
			}

			System.out.println(String.format("두 수의 합: %d", num1+num2));
		}
	}
}
