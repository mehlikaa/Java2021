package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("/Users/mehlika/Desktop/GitHub_Java/Java2021/eclipse-workspace/5-JavaFall2021/src/day40Yazi.txt");
			
			System.out.println("görev tamamlandı");
			
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);

			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException a) {
			
			a.printStackTrace();
			
		}
	
	System.out.println("Gorev tamamlandi ");
	}
}