package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		while(true) {
			System.out.print("정수를 입력하세요(0 입력시 종료):");
			int input = scanner.nextInt();

			if(input == 0) break;

			sum += input;
		}
		System.out.println("sum = " + sum);
	}
}
