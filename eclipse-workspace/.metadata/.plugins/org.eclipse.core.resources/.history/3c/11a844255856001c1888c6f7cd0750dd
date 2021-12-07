package HB03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
	Scanner scan=new Scanner(System.in);
	System.out.print("1. tamsayiyi giriniz");
	int a=scan.nextInt();
		
	System.out.print("2. tamsayiyi giriniz");
	int b=scan.nextInt();
	
	System.out.print("3. tamsayiyi giriniz");
	int c=scan.nextInt();

	if ((a+b>c && c>a-b) || (a+c>b && b>a-c) || (b+c>a && a>b-c))	{
		System.out.println("Bu bir ucgendir.");
		
	if(a==b && b==c) {
		System.out.println("Bu bir eskenar  ucgendir.");
	}	
	} else
	System.out.println("Bu bir ucgen olcusu degildir.");
	
	}

}
