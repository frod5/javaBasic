package method;

public class MethodReturn1 {
	public static void main(String[] args) {
		boolean result = odd(3);
		System.out.println("result = " + result);
	}

	public static boolean odd(int i) {
		return i % 2 == 1;
	}
}
