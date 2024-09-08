package hw4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)

public class Hw4_3 {

	public static void main(String[] args) {
		// 定義字串陣列
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 初始化母音計數器
		int vowelCount = 0;

		// 遍歷每個字串
		for (String planet : planets) {
			// 遍歷每個字串中的每個字元
			for (int i = 0; i < planet.length(); i++) {
				char ch = planet.charAt(i);
				// 檢查字元是否為母音
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
			}
		}

		// 輸出總共有多少個母音
		System.out.println("母音總數: " + vowelCount);
	}

}
