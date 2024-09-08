package hw4;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//表如下:
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//員工編號: 25 19 27 共 3 人!」
//
//(提示:Scanner,二維陣列)

import java.util.Scanner;


public class Hw4_4 {
	public static void main(String[] args) {
		// 定義二維陣列，第一列是員工編號，第二列是現金金額
		int[][] employees = { { 25, 32, 8, 19, 27 }, // 員工編號
				{ 2500, 800, 500, 1000, 1200 } // 員工身上的現金
		};

		Scanner scanner = new Scanner(System.in);

		// 提示使用者輸入欲借的金額
		System.out.print("請輸入欲借的金額: ");
		int amount = scanner.nextInt();

		StringBuilder availableEmployees = new StringBuilder();
		int count = 0;

		// 遍歷所有員工，檢查現金是否足夠
		for (int i = 0; i < employees[0].length; i++) {
			if (employees[1][i] >= amount) {
				availableEmployees.append(employees[0][i]).append(" ");
				count++;
			}
		}

		// 輸出結果
		if (count > 0) {
			System.out.println("有錢可借的員工編號: " + availableEmployees.toString() + "共 " + count + " 人!");
		} else {
			System.out.println("沒有員工有足夠的現金可以借給你。");
		}

		scanner.close();
	}
}