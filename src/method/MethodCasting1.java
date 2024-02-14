package method;

public class MethodCasting1 {
	public static void main(String[] args) {
		double number = 1.5;
		// printNumber(number); double -> int로 형변환하여 컴파일오류
		printNumber((int) number); // 명시적 형변환하여 실행 1.5 -> 1
	}

	public static void printNumber(int n) {
		System.out.println("n = " + n);
	}
}
