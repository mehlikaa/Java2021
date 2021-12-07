package P01_1;

public class S02_TersSlash_KarakterYazdirma {
	
	public static void main(String[] args) {
		/*
		 * \n or \r ; starts from a new line; metni bir alt satirdan itibaren yazdirin. 
			\t ; horizontal tab; metni yatayda 1 tab miktari kaydirir.
			\\ ; prints a back slash ; \ yazdirir.
////////////////////////////FuUUUUUUUUUUUUUUUUUUUUUUUUUUU∫			\' ; prints single quote ; 'tek tirnak yazdirir
			\"; prints double quote ; " yazdirir.
		 */
		//  Soru1 ; "Hello ", "World \/" yazdirm
		
		System.out.println(" \"Hello \", \"World \\ /  \" ");
		
		//2. Pazartesi kelimesinin her bir harfini ayri bir satira yazdiriniz
		
		System.out.println("P\n a \n  z \n   a \n    r \n     t \n      e \n       s \n        i ");
		System.out.println(" P\n a \n z \n a \n r \n t \n e \n s \n i ");

		// Soru-3; "Java" ile hayat cok 'afilli' yazdiriniz.
		
		System.out.println(" \"Java\" ile hayat cok \'afilli\'" );

	/* Soru3. "Basari" gayrete 
	 *        'asiktir' yazdiriniz sonraki "TechProEd ile Java ile cok kolay..." 
	 *        ifadesi 3 satir sonra ve satir basindan 1 tab ileri yazilsin
	 */
	System.out.println("\"Basari\" gayrete \n\'asiktir\'. \n\n\n\t\"TechProEd\" ile Java cok kolay.\"");
	}
}
