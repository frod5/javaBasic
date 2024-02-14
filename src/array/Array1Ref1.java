package array;

public class Array1Ref1 {

	public static void main(String[] args) {
		int[] students; // 배열 변수 선언
		students = new int[5]; //배열 생성

		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;

		for(int student : students) {
			System.out.println("student = " + student);
		}
	}
}
