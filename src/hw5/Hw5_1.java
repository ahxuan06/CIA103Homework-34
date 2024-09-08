package hw5;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如

//圖:

import java.util.Scanner;

public class Hw5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 提示使用者輸入寬與高
		System.out.print("請輸入寬與高，寬高之間需空格格：");

		// 接收寬與高的輸入
		int width = scanner.nextInt();
		int height = scanner.nextInt();

		// 呼叫 starSquare 方法，打印星號長方形
		starSquare(width, height);
	}

	// 定義方法，負責印出星號長方形
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) { // 控制行數 (高度)
			for (int j = 0; j < width; j++) { // 控制列數 (寬度)
				System.out.print("*"); // 印出星號
			}
			System.out.println(); // 每列輸出完成後換行
		}
	}
}
