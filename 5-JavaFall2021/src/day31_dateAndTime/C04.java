package day31_dateAndTime;

import java.time.LocalTime;

public class C04 {

	public static void main(String[] args) {
	
		// bir string ve bir int variable olusturalim
		//bir loop icerisinde bu variablelaeri 1000 kere degistirip 
		// islem surelerini kiyaslayalim.
		
		LocalTime saatS=LocalTime.now();
		System.out.println("Baslangic saati : "+ saatS);
		
		String str="Celil";
		for (int i = 0; i < 10000; i++) {
			str+= "";
		}
		LocalTime saatBS=LocalTime.now();
		System.out.println( "Bitis saati : "+ saatBS);
		
		// eger bir islemin baslangic ve bitis saatini kaydetek istiyorsak, local time objesi olusturmliyiz.
		
		double nanoS=saatS.getNano();
		double nanoBS=saatBS.getNano();
		
		System.out.println("String bitis suresi   "+(nanoBS-nanoS));		//Fark  3.4599E7
		
		
		LocalTime saatI=LocalTime.now();
		System.out.println("Baslangic saati : "+ saatI);
		
		int sayi=10;
		for (int i = 0; i < 10000; i++) {
			str+= "";
		}
		LocalTime saatBI=LocalTime.now();
		System.out.println( "Bitis saati : "+ saatBI);
		
		// eger bir islemin baslangic ve bitis saatini kaydetek istiyorsak, local time objesi olusturmliyiz.
		
		double nanoI=saatI.getNano();
		double nanoBI=saatBI.getNano();
		
		System.out.println("Int Bitis Suresi  "+(nanoBI-nanoI));		//Fark  3.4599E7

		System.out.println("String icin : "+(nanoBS-nanoS)+" Integer icin : "+(nanoBI-nanoI));
		System.out.println("Int Stringden   :"+((nanoBS-nanoS)- (nanoBI-nanoI))+ " kadar daha hizli ");
	}

}
