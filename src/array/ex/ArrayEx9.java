package array.ex;

import java.util.Scanner;

public class ArrayEx9 {

	private static final int CREATE_PRODUCT = 1;
	private static final int GET_PRODUCTS = 2;
	private static final int EXIT = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxProductCount = 10;
		int productCount = 0;
		String[] productNames = new String[maxProductCount];
		int[] productPrices = new int[maxProductCount];

		while (true) {
			System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
			System.out.print("메뉴를 선택하세요:");
			int option = scanner.nextInt();
			scanner.nextLine();

			if (option == CREATE_PRODUCT) {

				if (productCount >= maxProductCount) {
					System.out.println("상품은 최대 10개까지 등록가능합니다.");
					continue;
				}

				System.out.print("상품이름을 입력하세요:");
				productNames[productCount] = scanner.nextLine();

				System.out.print("상품가격을 입력하세요:");
				productPrices[productCount] = scanner.nextInt();

				productCount++;
			} else if (option == GET_PRODUCTS) {

				if (productCount == 0) {
					System.out.println("등록된 상품이 없습니다.");
					continue;
				}

				for (int i = 0; i < productNames.length; i++) {
					if (productNames[i] != null && productPrices[i] > 0) {
						System.out.println(productNames[i] + " : " + productPrices[i]);
					}
				}
			} else if (option == EXIT) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택하였습니다.");
			}
		}
	}
}
