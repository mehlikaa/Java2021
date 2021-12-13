package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// Java da bir dosyaya ulasmak istedigimizde FileInputStream classindan yardim aliriz.
		
		FileInputStream file=new FileInputStream(" /Users/mehlika/Desktop/GitHub_Java/Java2021/eclipse-workspace/5-JavaFall2021/src/day40/Yazi.txt");
		
		//Jana bu kodda olasi bir problem goruyor
		// ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod CTE degildir.
		
		// iki durum soz konusu
		// 1- try catch ile bu problemi handle edip javanin yoluna devam etmesini saglayabiliriz.
		// 2- eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkindayim
		// ve sorumlulugun bizde old Javaya soylemeliyiz.
		
		System.out.println("Soruun tamamlandi");
	}

}
// Bu file ile kendi veritabanimizi yazdirip kalici tutabilir miyiz