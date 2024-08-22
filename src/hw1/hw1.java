package hw1;

public class hw1 {

	public static void main(String[] args) {

		System.out.println("1. ");
		int num1 = 12;
		int num2 = 6;

		int sum = num1 + num2;
		int product = num1 * num2;

		System.out.println("兩數的和: " + sum);
		System.out.println("兩數的積: " + product);

		System.out.println("2. ");
		int Eggs = 200;
		int adozenEggs = 12;

		int dozens = Eggs / adozenEggs; // 計算有幾打
		int remainingEggs = Eggs % adozenEggs; // 計算剩下的蛋數

		System.out.println("共 " + dozens + " 打又 " + remainingEggs + " 顆蛋");

		System.out.println("3.");
		int TotalSeconds = 256559;
		int DayofHour = 24;
		int HourofMin = 60;
		int MinofSeconds = 60;

		int Min = TotalSeconds / MinofSeconds;
		int Hour = TotalSeconds / MinofSeconds / HourofMin;
		int Day = TotalSeconds / MinofSeconds / HourofMin / DayofHour;

		System.out.println("各總共" + Day + "天" + "、" + Min + "分" + Hour + "小時");

		System.out.println("4.");
		final double PI = 3.14;
		int r = 5;
		double area = PI * r * r;
		double v = 2 * r * PI;
		System.out.println("圓面積" + area);
		System.out.println("周長" + v);

		System.out.println("5.");

		double principal = 1500000;
		double Rate = 0.02;
		int years = 10;

		double totalAmount = principal * Math.pow(1 + Rate, years);

		System.out.println("經過 " + years + " 年本金加利息共: " + (int) totalAmount + "元");

		System.out.println("6.");
		// 5 + 5
		// 這是兩個整數相加，結果為10
		System.out.println(5 + 5);

		// 5 + '5'
		// '5' 是一個字符，它的ASCII碼是53，因此這裡實際上是5 + 53，結果為58
		System.out.println(5 + '5');

		// 5 + "5"
		// "5" 是一個字符串，當數字5與字符串相加時，Java會將數字5轉換為字符串，結果為"55"
		System.out.println(5 + "5");

	}

}
