package hw2;

public class Hw {
	public static void main(String[] args) {

		// 1. 計算 1~1000 的偶數和 (2+4+6+8+...+1000)
		System.out.println("1. ");
		int sum = 0; // 初始化總和為 0
		for (int i = 2; i <= 1000; i += 2) { // 從 2 開始，每次增加 2
			sum += i; // 將每個偶數加到總和中
		}
		System.out.println("1~1000 的偶數和: " + sum);

		// 2. 計算 1~10 的連乘積 (1*2*3*...*10) (用 for 迴圈)
		System.out.println("2. ");
		int product = 1; // 初始化乘積為 1
		for (int i = 1; i <= 10; i++) { // 從 1 到 10 迴圈
			product *= i; // 將每個數字乘到乘積中
		}
		System.out.println("1~10 的連乘積: " + product);

		// 3. 輸出 1 到 10 的平方數
		System.out.println("3. ");
		for (int s = 1; s <= 10; s++) { // 從 1 到 10 的迴圈
			System.out.print(s * s + " "); // 計算平方並輸出
		}
		System.out.println();

		// 4.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("4. ");
		String res = "";
		int count = 0;

		for (int i = 1; i <= 49; i++) {

			String toStr = Integer.toString(i);
			char[] toStrarray = toStr.toCharArray();// 產生貨櫃

			int checkis4 = 0;// 檢查值
			// 翻箱倒櫃
			for (int k = 0; k < toStrarray.length; k++) {
				// 檢查貨櫃
				if (toStrarray[k] == '4') {
					checkis4++;
				}

			}

			if (checkis4 == 0) {

				res += toStr + ",";
				count++;
			}
		}
		System.out.println("阿文可以選擇的數字有" + res);
		System.out.println("總共有幾個" + Integer.toString(count));

		// 5. 請設計一隻Java程式,輸出結果為以下:
				// 1 2 3 4 5 6 7 8 9 10
				// 1 2 3 4 5 6 7 8 9
				// 1 2 3 4 5 6 7 8
				// 1 2 3 4 5 6 7
				// 1 2 3 4 5 6
				// 1 2 3 4 5
				// 1 2 3 4
				// 1 2 3
				// 1 2
				// 1
				System.out.println("5. ");
				for (int i = 10; i >= 1; i--) { // 從 10 到 1 的外層迴圈
					for (int j = 1; j <= i; j++) { // 內層迴圈從 1 到 i
						System.out.print(j + " "); // 輸出當前的 j 值
					}
					System.out.println(); // 每次內層迴圈結束後換行
				}

				// 6. 請設計一隻Java程式,輸出結果為以下:
				// A
				// BB
				// CCC
				// DDDD
				// EEEEE
				// FFFFFF
				System.out.println("6. ");
				for (int i = 1; i <= 6; i++) {
					char ch = (char) ('A' + i - 1);
					for (int j = 1; j <= i; j++) { // 內層迴圈，控制字母的重複次數
						System.out.print(ch); 
					}
					System.out.println(); 
				}
			}
		}