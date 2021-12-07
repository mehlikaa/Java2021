package P03_05_StringManipulationHB;

public class Q11_charAt_contains {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
    	// -- me --
    	String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
    	int a=pickName.indexOf('A');
    	int i=pickName.indexOf('I');
    	int l=pickName.indexOf('L');
    	//                   System.out.println("Index numaralariniz : "+i+" "+l);
    	if (pickName.contains("A") && pickName.contains("L") && pickName.contains("I")) {
    		System.out.println("Isim :"+pickName.charAt(a)+" "+pickName.charAt(l)+" "+pickName.toLowerCase().charAt(i) );
    		
    	} else { 
    		System.out.println("Istedigim harfleri bulamaddiiiim kiii");
    	}
    	// ---- me ----
    }

}
