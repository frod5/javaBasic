package casting;

public class Casting3 {
	public static void main(String[] args) {
		long maxIntValue = 2147483647; // int 최고값
		long maxIntValueOver = 2147483648L; // int 최고값 + 1

		int intValue = 0;

		intValue = (int) maxIntValue; //형변환
		System.out.println("maxIntValue casting = " + intValue);

		intValue = (int) maxIntValueOver; //형변환
		System.out.println("maxIntValueOver casting = " + intValue);
	}
}
