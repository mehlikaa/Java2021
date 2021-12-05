package PC08_while_dowhile__l;

import java.util.Scanner;

public class Q02_teksayi_indexkarakter {

	public static void main(String[] args) {
        
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String  str = scan.nextLine();
        int index=0;
        do {
        	if (index%2==1){
				System.out.print(str.charAt(index)+" ");
			}
        	index++;
		}while(index<str.length());
        
        System.out.println("====================me==");
        
        Scanner scanme = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String  strme = scanme.nextLine();
        int indexme=0;
        
        do {
        	if(indexme%2==1) {
        		System.out.print(strme.charAt(indexme)+" ");
        	}
        	indexme++;
        }while (indexme<strme.length());
        System.out.println("====================sorry just copy me==");
	}
        
	}


