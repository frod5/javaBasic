package method.ex;

import java.util.Scanner;

public class MethodEx4 {
	public static void main(String[] args) {
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1.입금 | 2.출금 | 3. 잔액확인 | 4.종료");
			System.out.println("---------------------------------");

			System.out.print("선택: ");
			int menu =  scanner.nextInt();
			scanner.nextLine();

			if(menu == 1) {
				System.out.print("입금액을 입력하세요:");
				balance = deposit(balance, scanner.nextInt());
			} else if (menu == 2) {
				System.out.print("출금액을 입력하세요:");
				balance = withdraw(balance, scanner.nextInt());
			} else if (menu == 3) {
				System.out.println("현재 잔액 : " + balance);
			} else if (menu == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴선택입니다.");
			}
		}
	}

	public static int deposit(int balance, int amount) {
		balance += amount;
		System.out.println(amount+"원 입금하였습니다. 현재 잔액: " + balance);
		return balance;
	}

	public static int withdraw(int balance, int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount+"원 출금하였습니다. 현재 잔액: " + balance);
		} else {
			System.out.println(amount+"원 출금하려 했으나 잔액이 부족합니다.");
		}

		return balance;
	}
}
