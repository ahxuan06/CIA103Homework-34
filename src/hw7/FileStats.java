package hw7;
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:

//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;

	public class FileStats {
	    public static void main(String[] args) {
	       
	    	 String filePath = "C:/CIA103_Workspace/Homework-34/src/hw7/Sample.txt";
	    
	        File file = new File(filePath);

	        long byteCount = 0;
	        int charCount = 0;
	        int lineCount = 0;

	        try {
	            byteCount = file.length();

	            BufferedReader br = new BufferedReader(new FileReader(file));
	            String line;
	            
	            while ((line = br.readLine()) != null) {
	                lineCount++;                // 計算列數
	                charCount += line.length();  // 計算字元數
	            }
	            
	            br.close();

	            System.out.println("Sample.txt 檔案共有 " + byteCount + " 個位元組, " 
	                                + charCount + " 個字元, " 
	                                + lineCount + " 列資料");
	            
	        } catch (IOException e) {
	            System.out.println("檔案讀取失敗：" + e.getMessage());
	        }
	    }
	}
	
	
