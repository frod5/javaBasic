package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] students = new int[5];
		int total = 0;

		System.out.println("5개의 점수를 입력하세요:");

		for (int i = 0; i < students.length; i++) {
			students[i] = scanner.nextInt();
			total += students[i];
		}

		System.out.println("total = " + total);
		System.out.println("avg = " + (double) total / students.length);
	}
}
