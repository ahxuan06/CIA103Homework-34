package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
          
            System.out.print("請輸入 x 的值：");
            int x = Integer.parseInt(scanner.nextLine());

       
            System.out.print("請輸入 y 的值：");
            int y = Integer.parseInt(scanner.nextLine());

        
            int result = calculator.powerXY(x, y);
            System.out.println(x + " 的 " + y + " 次方等於 " + result);

        } catch (NumberFormatException e) {
            System.out.println("輸入格式不正確");

        } catch (CalException e) {
            System.out.println(e.getMessage());
        }
    }
}