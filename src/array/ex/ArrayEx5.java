package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;

		System.out.println("입력받을 숫자를 입력하세요:");

		int[] students = new int[scanner.nextInt()];
		scanner.nextLine();

		System.out.println("입력받을 점수 "+students.length+"개를 입력하세요:");

		for (int i = 0; i < students.length; i++) {
			students[i] = scanner.nextInt();
			total += students[i];
		}

		System.out.println("total = " + total);
		System.out.println("avg = " + (double) total / students.length);
	}
}
