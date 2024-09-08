package hw4;

//	第二題
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH

public class Hw4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] reverseArray = new char[s.length()];
		char[] stringArray = s.toCharArray(); // 將字串轉換成一個char陣列

		for (int i = 0; i < stringArray.length; i++) {
			reverseArray[i] = stringArray[stringArray.length - (i + 1)];
		}

		// 將 char[] 轉回字串
		String reversedString = new String(reverseArray);

		// 輸出結果
		System.out.println(reversedString);
	}
}