package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생수를 입력해주세요:");
		int studentCount = scanner.nextInt();

		String[] subjects = {"국어", "영어", "수학"};
		int[][] scores = new int[studentCount][subjects.length];

		for (int row=0; row < scores.length; row++) {
			System.out.println((row + 1) + "번 학생의 점수를 입력하세요:");
			for(int col=0; col < scores[row].length; col++) {
				System.out.print(subjects[col] + " 점수:");
				scores[row][col] = scanner.nextInt();
			}
		}

		for (int row=0; row < scores.length; row++) {
			int total = 0;
			for(int col=0; col < scores[row].length; col++) {
				total += scores[row][col];
			}

			System.out.println((row+1) + "번 학생의 총점: " + total + ", 평균: " + (double) total / scores[row].length);
		}
	}
}
