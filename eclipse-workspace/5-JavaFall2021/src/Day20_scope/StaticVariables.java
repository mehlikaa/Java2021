package Day20_scope;

public class StaticVariables {

	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static String cadee;
	static boolean aktifMi=true;
	static boolean tatildeMi;

	//staticse 1 tane var. objeye bagli degil tek variable, son atamasi neyse o gorunur

	public static void main(String[] args) {
		// static variablelara ulasilabilir mi? evet
		System.out.println("No : "+ no);			//No : 20
		no++;
		System.out.println("No : "+ no);			//No : 21
		staticMethod();
		// staticOlmayanMethod(); //cagiralamaz
		StaticVariables obje=new StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println("No static mainden: "+ no);	// No static mainden: 23
}
	
	
	public static void staticMethod() {
		// static variablelara ulasilabilir mi? evet
		no++;
		System.out.println("No : "+ no);		//Sayi : 22
	} 
	
	public void staticOlmayanMethod() {
		// static variablelara ulasilabilir mi? Evet
		// static olan/olmayan tum metodlardan ula;ilabilir.
		// bu yuzden static variablelara CLASS VARIABLE denir.
		no++;
		System.out.println("No Static : "+ no);		//  No Static : 23
	}
}