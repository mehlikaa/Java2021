package P01_1;

public class S01_sayini_altalta_yazdirma_cevap {

	public static void main(String[] args) {
		int sayi=12345;
		int birler=sayi%10;
		int onlar=(sayi/10)%10;
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onbinler=(sayi/10000)%10;
		
		System.out.println(onbinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		
		//daha kisa yazmak icin, 
		System.out.println(onbinler+"\n" + binler+"\n"+onlar+"\n"+birler);
		
	}

}
