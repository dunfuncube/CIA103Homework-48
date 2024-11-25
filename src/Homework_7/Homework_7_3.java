package Homework_7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。
//呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class Homework_7_3 {
	
	public static void main(String[] args) {
		File fileIn = new File("src/Homework_7/Sample.txt");
		File fileOut = new File("src/Homework_7/Copy.txt");
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
