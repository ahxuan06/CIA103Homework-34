package hw3;

import java.util.Scanner; // 匯入 Scanner 類別

public class Hw3 {

//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:請輸入三個整數:

public static void main(String[] args) {
	Scanner scanner1 = new Scanner(System.in);

	// 提示使用者輸入三個整數
	System.out.println("請輸入三個整數:");

	int a = scanner1.nextInt();
	int b = scanner1.nextInt();
	int c = scanner1.nextInt();

	// 判斷是否為三角形
	if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
		if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (a == b || b == c || a == c) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其它三角形");
		}
	} else {
		System.out.println("不是三角形");
	
		
	}

}


}
