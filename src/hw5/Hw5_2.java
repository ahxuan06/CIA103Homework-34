package hw5;

import java.util.Random;

public class Hw5_2 {

	public static void main(String[] args) {
		randAvg(); // 呼叫 randAvg 方法
	}

	// 定義 randAvg 方法
	public static void randAvg() {
		Random random = new Random(); // 創建一個 Random 物件來生成隨機數
		int[] randNumbers = new int[10]; // 建立一個大小為 10 的陣列來儲存隨機數
		int sum = 0; // 初始化總和為 0

		System.out.print("本次亂數結果：");

		// 生成 10 個隨機數並加總
		for (int i = 0; i < 10; i++) {
			randNumbers[i] = random.nextInt(101); // 生成 0 到 100 之間的亂數
			sum += randNumbers[i]; // 將每個隨機數加到總和中
			System.out.print(randNumbers[i] + " "); // 印出每個隨機數
		}

		// 計算平均值
		double average = (double) sum / randNumbers.length;
		System.out.println(); // 換行
		System.out.println("平均值：" + average); // 印出平均值
	}
}
