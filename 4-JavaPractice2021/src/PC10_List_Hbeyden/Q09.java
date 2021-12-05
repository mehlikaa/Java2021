package PC10_List_Hbeyden;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
	    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
        (Ignore case sensitivity)

        Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiriniz
      input : Learning java is easy
      output: maximumCounts occurring character is : a
       */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir metin giriniz ");
		
		String str=scan.nextLine();		//hayaa cooook bayat
		
		String arr[]=str.split("");
		
		System.out.println("Metnim : "+ Arrays.toString(arr));
		
		String encokTekrar="";
		int sayac=0;
		int maxsayac=0;
		
		for (int i = 0; i < arr.length; i++) { 	//karsilastirilan karakter kontrolu
			for (int j = i+1; j < arr.length; j++) {		// karsilastiran karakterkarakter kontrolu
				
				if(arr[i].equalsIgnoreCase(arr[j])) {	//esit karakterlerin kontrolu ile saydir
					sayac++;		
				}	
			}
			if(sayac>maxsayac) {
				maxsayac=sayac; 
				encokTekrar = " "+arr[i];
			} else if(sayac==maxsayac) {
				encokTekrar += " "+arr[i];
			}
			sayac=0;
			
		}
		System.out.println("En cok tekrar eden"+encokTekrar);
	}

}
