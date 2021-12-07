package HB07_ForLoop;

import java.util.Scanner;

public class Q08_me_terstencumle {

	public static void main(String[] args) {
        
		// Kullanicidan bir String isteyin. 
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        String tesrtenCumle ="";
        
        for(int i=cumle.length()-1;i>=0;i--) {
        	tesrtenCumle += cumle.charAt(i);
        }
        if(cumle.equalsIgnoreCase(tesrtenCumle)) {
        	System.out.print("Polidir, tersten okudum ayni\n "+ tesrtenCumle.toLowerCase()); 
        } else { 
        	System.out.print("Poli degildir daaa");
        }
	}

}
