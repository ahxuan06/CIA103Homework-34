package hw4;

//班上有8位同學,他們進行了6次考試結果如下:
//
//請算出每位同學考最高分的次數
//(提示:二維陣列)

public class Hw4_6 {

	public static void main(String[] args) {
		// 定義二維陣列來儲存考試分數
		int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 90, 75 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		// 儲存每位同學考最高分的次數
		int[] highestScoreCount = new int[scores[0].length];

		// 逐行檢查每次考試的成績
		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			for (int j = 0; j < scores[i].length; j++) {
				// 找到本次考試的最高分
				if (scores[i][j] > maxScore) {
					maxScore = scores[i][j];
				}
			}
			// 檢查哪些同學在本次考試中取得最高分
			for (int j = 0; j < scores[i].length; j++) {
				if (scores[i][j] == maxScore) {
					highestScoreCount[j]++;
				}
			}
		}

		// 輸出每位同學考最高分的次數
		for (int i = 0; i < highestScoreCount.length; i++) {
			System.out.println("同學 " + (i + 1) + " 考最高分的次數: " + highestScoreCount[i] + " 次");
		}
	}

}
