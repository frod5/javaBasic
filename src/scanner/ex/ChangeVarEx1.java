package scanner.ex;

public class ChangeVarEx1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a의 값: " + a + " b의 값: " + b);
	}
}
