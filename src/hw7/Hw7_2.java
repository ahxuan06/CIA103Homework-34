package hw7;
//• 請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//append功能讓每次執行結果都能被保存起來)
//	
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

	public class Hw7_2 {
	    public static void main(String[] args) {
	      
	        Random random = new Random();

	     
	        String fileName = "Data.txt";

	    
	        try (FileWriter writer = new FileWriter(fileName, true)) {
	         
	            for (int i = 0; i < 10; i++) {
	                int randomNumber = random.nextInt(1000) + 1;  
	                writer.write(randomNumber + "\n");            
	            }
	            System.out.println("10 個亂數已經寫入 " + fileName + " 檔案中。");
	        } catch (IOException e) {
	            System.out.println("檔案寫入失敗：" + e.getMessage());
	        }
	    }
	}


