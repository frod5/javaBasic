package loop.ex;

public class WhileEx2 {
	public static void main(String[] args) {
		int i = 1;
		int num = 2;

		while(i <= 10) {
			System.out.println("num = " + num);
			num += 2;
			i++;
		}
	}
}
