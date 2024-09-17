package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Hw7_3 {
	public static void main(String[] args) {
		File fileIn = new File("src/hw7/Sample.txt");
		File fileOut = new File("src/hw7/Copy.txt");
		copyFile(fileIn, fileOut);

	}

	public static void copyFile(File fileRead, File fileWrite) {
		try {
			FileReader fr = new FileReader(fileRead);
			FileWriter fw= new FileWriter(fileWrite);
			
			int i;
			while ((i = fr.read()) != -1) {
				fw.write(i);

			}
			fw.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}