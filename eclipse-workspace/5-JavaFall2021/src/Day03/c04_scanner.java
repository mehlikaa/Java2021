package Day03;

import java.util.Scanner;

public class c04_scanner {

		public static void main(String[] args) {
			//kullanicidan deger almak icin uc adim 
			// 1. adim scanner objesi olusturmak
			
			Scanner scan=new Scanner(System.in);
			
			//Kullaniciya ne istediginizi soylemek
			
			System.out.println("Lutfen isminizi yaziniz : ");
			
			//Nereye yazacak
			// decleration yaz. scanden sonra method sec next()
			String isim = scan.next();
			System.out.println("Isminiz... : "+isim);
			// scan bir scanner objesidir
			// isim olarak farkli bir isim yazsak da calisir ama scan demeyi tercih etmeyiz.
			// scan bir objedir ve Non-Primitive dir.
			//primitive data turleri sadece deger icerirken Nn primitivleer
			// data turleri degerin yaninda, methodlar bulundurur.bsrinndirir.
			// Non primitive kullanirsaniz, bir suru hazir method verir.
			//scan. dedigimizde kullanabilecegimiz bu methodlari gorebliiriz
			// int a=1; primitive a.a denildiginde hicbir method ailmaz.
		scan.close();
		
		}
}
