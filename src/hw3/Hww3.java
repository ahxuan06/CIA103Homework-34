package hw3;

import java.util.Scanner;


public class Hww3 {

//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
//
//	(提示:Scanner,亂數方法,無窮迴圈)
//	(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	
	    public static void main(String[] args) {
	       
	    	Scanner scanner1 = new Scanner(System.in);
	        
	        
	        // 隨機產生一個 0 到 100 的數字
	        int answer = (int)(Math.random() * 101);
	        
	        System.out.println("開始猜數字吧! (0~100)");

	        while (true) {
	            int guess = scanner1.nextInt(); // 讀取使用者的猜測數字
	            
	            if (guess == answer) {
	                System.out.println("答對了!答案就是 " + answer);
	                break; // 猜對了，結束迴圈
	            } else if (guess < answer) {
	                System.out.println("猜錯囉，答案比 " + guess + " 大");
	            } else {
	                System.out.println("猜錯囉，答案比 " + guess + " 小");
	            }
	        }
	    }
	}