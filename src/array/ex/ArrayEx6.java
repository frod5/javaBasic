package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력받을 숫자를 입력하세요:");
		int[] numbers = new int[scanner.nextInt()];
		int minNumber, maxNumber;

		System.out.println(numbers.length + "개의 정수를 입력하세요:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		minNumber = numbers[0];
		maxNumber = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] < minNumber) minNumber = numbers[i];
			if(numbers[i] > maxNumber) maxNumber = numbers[i];
		}

		System.out.println("minNumber = " + minNumber);
		System.out.println("maxNumber = " + maxNumber);
	}
}
