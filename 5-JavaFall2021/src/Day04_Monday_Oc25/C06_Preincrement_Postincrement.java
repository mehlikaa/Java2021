package Day04_Monday_Oc25;

public class C06_Preincrement_Postincrement {

	public static void main(String[] args) {
		//preincrement ve post increment
		//sadece sayi++ ve sayi-- icin gecerli.
		int sayi=10;
		
		sayi++;    //1.islem
		sayi++;    //2.islem
		sayi++;    //3.islem
		
		System.out.println(sayi);   // bu da bir islem, yazdir.
		
		System.out.println(sayi++);  //iki islem var, artir ve yazdir.
		System.out.println(sayi);    //yazdir ve artir. bir sonrakinde yazdiri.
		System.out.println(++sayi);    //once artir ve yazdir
		//once artirmami ve yazdirmami istiyorsan ---> ++sayi
		//once yazdirmak ve artirmak icin -->  sayi++
		
		
	}

}
