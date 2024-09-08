package hw5;

public class MyRectangle {

	// (1) 兩個 double 型態的屬性 width 和 depth
	private double width;
	private double depth;

	// (3) 無參數且無內容的建構子
	public MyRectangle() {
		// 不執行任何操作
	}

	// (3) 帶有 width 和 depth 參數的建構子
	public MyRectangle(double width, double depth) {
		this.width = width; // 將參數 width 賦值給屬性 width
		this.depth = depth; // 將參數 depth 賦值給屬性 depth
	}

	// (2) 設定 width 的方法
	public void setWidth(double width) {
		this.width = width; // 將收到的引數指定給 width 屬性
	}

	// (2) 設定 depth 的方法
	public void setDepth(double depth) {
		this.depth = depth; // 將收到的引數指定給 depth 屬性
	}

	// (2) 計算面積的方法
	public double getArea() {
		return width * depth; // 計算並回傳長方形的面積
	}
}