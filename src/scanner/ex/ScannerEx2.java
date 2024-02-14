package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력해주세요:");
		int num = scanner.nextInt();
		System.out.println("입력한 수 "+ num +"은(는) " + (num % 2 == 0 ? "짝수" : "홀수") + "입니다.");
	}
}
