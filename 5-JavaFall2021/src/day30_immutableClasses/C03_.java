package day30_immutableClasses;

public class C03_ {

	public static void main(String[] args) {
		//Javada string iki turlu olusturlabilir
		// 1- non primitive old icin new keywordu ile olusturulur.
		// esitligin saginda yeni bir string/obje olutur ve degeri mustafa olsun sonra referansini soyluyor
		// Java once esitligin once sagina baktigindan once obje olusturur sonra degeri atar.
		// yani her seferinde yeni obje olusur.
		// bizim yaptigimiz gibi kisa olusturursak str1 ve str2 gibi
		// sagnda Mustafa horunce ben de zaten var. r1ín yanina r2yi koyuyor.
		// Java bu durumda esitligin saginda olan stringin(Mustafa) , string havuzunda olup olmadigini kontrol eder.
		// ve havuzda varsa yeni obje olusturmaz. oncekinin referansina yeninin referansini da ekler.
		// == yanlis sonuc verebilir. ksin dogru cevap vermeyebilir. istisna
		
		
		String str1="Mustafa";
		String str2="Mustafa";
		
		String str3=new String("Mustafa");   	//non primitive new ile olusmali
		String str4=new String ("Mustafa");		//cok kullanildigi icin string de kullanilma mecburiyeti kalmis
		
		System.out.println(str1==str3);			// False hem referans hem deger kontrol ve referans farkli False
		System.out.println(str1.equals(str3)); 	//true sadece degere bakardi
		
		System.out.println(str4==str3);				// false
		System.out.println(str4.equals(str3)); 	//true
		
		System.out.println(str1==str2);					//true cunku ayri referans olusturuyor ama onlari yanyana tutuyor ayni gibi davraniyorlar
																		// bakiyor mustafa String havuzunda var. Bu tanidik diyor. HAvuzdaki Mustafa ile eslestiriyor.
		System.out.println(str1.equals(str2)); 
	}

}
