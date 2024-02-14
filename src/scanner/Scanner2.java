package scanner;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번쨰 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.print("두 번쨰 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		System.out.println(String.format("두 수의 합은 = %d", num1 + num2));
	}
}
