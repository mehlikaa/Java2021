package Day11_;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyaoglu";
		System.out.println(str1.length()); //kac karakteri var
		
		System.out.println(str1.charAt(str1.length()-1)); // son harfi yazdir
		
		System.out.println(str1.charAt(12)); //ama kelime degistiginde olmaz
		
		System.out.println("*******");
		
		String str2="";
		System.out.println(str2.length()); //0
		
		String str3=null;                   // deger olusturmadigimdan
		//System.out.println(str3.length()); //hata degersiz
	
		System.out.println(str3); //null

		String str4;                 // hic atama yapmadigi icin
		// System.out.println(str4);    // hata verir, calismaz
		
		//Null ile, bilerek olusturdugumuzu ve bilerek deger atamadigimizi soyluyor
		
		// null pointer olusturdugumuz fakat sonra kullanacagimiz bir String'i isaretlemek icin kullanilir
        // Bir String i yazdirdigimizda null cikiyorsa turkce olarak
        // " Ben bu degiskeni olusturdum ama henuz deger atamadim" demek istiyor
	}

}
