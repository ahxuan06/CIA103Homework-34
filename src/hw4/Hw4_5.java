package hw4;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

import java.util.Scanner;

public class Hw4_5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 提示使用者輸入年份、月份和日期
		System.out.print("請輸入西元年份(yyyy): ");
		int year = scanner.nextInt();

		System.out.print("請輸入月份(mm): ");
		int month = scanner.nextInt();

		System.out.print("請輸入日期(dd): ");
		int day = scanner.nextInt();

		// 定義每個月份的天數
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 判斷是否為閏年
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		// 若是閏年且月份為2月，則該月有29天
		if (isLeapYear) {
			daysInMonth[1] = 29;
		}

		// 驗證輸入的月份和日期是否合理
		if (month < 1 || month > 12) {
			System.out.println("輸入的月份不正確，請輸入1到12之間的數字。");
			return;
		}

		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("輸入的日期不正確，該月份只有 " + daysInMonth[month - 1] + " 天。");
			return;
		}

		// 計算該日期是該年的第幾天
		int dayOfYear = 0;

		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}
		dayOfYear += day;

		// 輸出結果
		System.out.println("輸入的日期為該年第 " + dayOfYear + " 天。");

		scanner.close();
	}
}
