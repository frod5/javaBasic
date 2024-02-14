package method;

public class Method1Ref1 {
	public static void main(String[] args) {
		//계산1
		int sum1 = add(1,2);
		System.out.println("sum1 = " + sum1);

		//계산2
		int sum2 = add(10,20);
		System.out.println("sum2 = " + sum2);
	}

	public static int add(int a, int b) {
		System.out.println(a + " + " + b +" 연산 실행");
		return a + b;
	}
}
