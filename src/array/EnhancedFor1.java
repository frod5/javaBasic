package array;

public class EnhancedFor1 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};

		//for
		for (int i=0; i< numbers.length; i++) {
			System.out.println("numbers["+i+"] = " + numbers[i]);
		}

		//향상된 for
		for(int number : numbers) {
			System.out.println("number = " + number);
		}
	}
}
