package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle mr1 = new MyRectangle();
		MyRectangle mr2 = new MyRectangle(10, 20);

		mr1.setWidth(10);
		mr1.setDepth(20);

		System.out.printf("mr1 area = %4.2f\n", mr1.getArea());
		System.out.printf("mr2 area = %4.2f\n", mr2.getArea());
	}
}
