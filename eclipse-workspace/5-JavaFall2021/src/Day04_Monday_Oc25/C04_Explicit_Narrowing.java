package Day04_Monday_Oc25;

public class C04_Explicit_Narrowing {

		public static void main(String[] args) {
			/* eger buyuk data turundeki bir veriyi, daha kucuk data turundeki
			 * variable'a atamak istersek java bunu otomatik yapmaz.
			 */
			
			int sayi1=300; 
			// short sayi2=sayi1;
			// sayi1'in uzerine gelince menuden manuel, Add Cast to Short komutu verilir. 
			// (short) kelimesini tanimlamasini ekler.
			// daha kucuk olan (byte) yazilabilir ama (double) yazamayiz.
			short sayi2=(short) sayi1;
			System.out.println("Sayi2 ; "+sayi2);
			
			byte sayi3=(byte) sayi2;
			System.out.println("Sayi3 ; "+sayi3);
			//deger byte'in sinirlarindan buuk old icin,Java kedni yontemine gore donusturur.
			// bu arada bizim sayimiz degisir.-127-0-127 scalsinda yeni sayi uretir.
			double sayi4=87.3;
			int sayi5=(int) sayi4;
			System.out.println("Sayi5 ; "+ sayi5);
			/*deger virgullu old ve int ondalikli kisim olmadigindan 
			 * ondalikli kismi keser ve data kaybi olusur.yuvarlama degil.
			 * virgulden sonrasini atar. Bankala daha cok double kullanirlar
			 */
			
			int sayi6=27;
			int sayi7=4;
			System.out.println(sayi6/sayi7);         //6
			//ikisi int old icin, sonucu int yazdirir.
			
			double sayi8=4;
			double sayi9=17;
			
			System.out.println(sayi6/sayi8);    //6.75
			//double old sonucu double yazdiri. daha buyuk olani, 
			//ust seviyeyi dikkate alir.
			System.out.println(sayi9/sayi7);    //4.25
			
		}
}
