package method.ex;

public class MethodEx1 {

	public static void main(String[] args) {
		System.out.println("avg = " + getAvg(1,2,3));
		System.out.println("avg = " + getAvg(15,25,35));
	}

	private static double getAvg(int a, int b, int c) {
		int sum = a + b + c;
		return sum / 3.0;
	}
}
