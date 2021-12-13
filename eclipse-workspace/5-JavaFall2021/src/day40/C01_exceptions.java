package day40;

public class C01_exceptions {

	public static void main(String[] args) {

		// 0á bolunemez hata verdigi icin, deva etmez bitirir.
		// gorev tamamlanmadan alt satira gecemez

		int a = 20;
		int b = 0;
		//System.out.println("sayilarin bolumu : " + (a / b));

		try { 						// yapmak istedigimiz islem yer alır
			
			System.out.println("Sayiilarin bolumu : " + (a / b));
		
		} catch (ArithmeticException e) {// olurda boyle bir hata ile karsılasırsan KODUN CALISMASINI DURDURMA
			
			System.out.println("bolme islemin de payda 0 olamz"); // bu islemi yap ve yoluna devam et java :))
			System.out.println("e.getMessage()   :     "+ e.getMessage());			// by zero exceptionin  kaynagi
			System.out.println("e.getLocalizedMessage()   :    "+ e.getLocalizedMessage());
			//void ise syso ya gerek yok
			System.out.print("e.printStackTrace()               ") ;
			e.printStackTrace();
		}

		System.out.println("gorev tamamlandı");
	}
	/*
	 * hata durumunda try { bu islemi yapmaya calis} catch (boyle bir hatayla
	 * karsilasirsan ) KODUN CALISMASINI DURDURMA { BU ISLEMI YAP VE YOLUNA DEVAM
	 * ET}
	 */
}