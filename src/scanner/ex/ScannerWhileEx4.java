package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

	private static final int PRODUCT_INPUT = 1;
	private static final int PRODUCT_ORDER_PAY = 2;
	private static final int PRODUCT_ORDER_END = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalPrice = 0;

		while (true) {

			System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
			int option = scanner.nextInt();

			if(option == PRODUCT_INPUT) {
				scanner.nextLine();
				System.out.print("상품명을 입력하세요:");
				String productName = scanner.nextLine();

				System.out.print("상품 가격을 입력하세요:");
				int price = scanner.nextInt();

				System.out.print("상품 수량을 입력하세요:");
				int quantity = scanner.nextInt();

				int cost = price * quantity;
				System.out.println("상품명 : " + productName + " 가격: " + price + " 수량: " + quantity + " 합계: " + cost);
				totalPrice += cost;
			}

			if(option == PRODUCT_ORDER_PAY) {
				System.out.println("총 비용: " + totalPrice);
				totalPrice = 0;
			}

			if(option == PRODUCT_ORDER_END) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
