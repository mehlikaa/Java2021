package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		
		// verilen bir int array icin, kullanicidan sayi isteyin.
		// girilen sayi isteyin, girilen sayiyi index olarak kabul edip,
		// o index deki elementi yazdiriniz.
		
		int arr[]= {2,3,5,2,7,9,1};
		
		// InputMismatchException
		// ArrayIndexOutOfBoundException
		
		
		try {
			
			Scanner scan=new Scanner(System.in);
			
			System.out.print("Lutfen elementi yazdirmak icin index degeri giriniz : ");
			
			int index=scan.nextInt();
			System.out.println("Girdiginiz indexteki element : "+arr[index]);
			
		} catch(ArrayIndexOutOfBoundsException e) { 
			System.out.print("Girdiginiz index array'de yok");
		}catch(InputMismatchException e) { 
			System.out.print("Girdiginiz index harf olmamal, poozitif tam sayi olmalii");
		}
	}

}
