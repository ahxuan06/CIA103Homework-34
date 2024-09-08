package hw5;

// 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
// genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
// 與數字的亂數組合,如圖:

public class Hw5_6 {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			while (true) {
				int num = (int) (Math.random() * 75 + 48); // 0~9 unicode = 48~57,A~Z 65~90, a~z 97~122
				if ((num > 57 && num < 65) || (num > 90 && num < 97)) {
					continue;
				} else {
					System.out.printf("%s", (char) num);
					break;
				}
			}
		}
	}
}
