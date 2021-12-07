package Day03;

public class c01_swap {
	public static void main(String[] args) {
		int sayi1 = 10;
		int sayi2 = 20;
		
		System.out.println("Sayi1 ; " + sayi1);
		System.out.println("Sayi2 ; " + sayi2);
		
		int sayitut;
		sayitut = sayi1;
		sayi1 = sayi2;
		sayi2 = sayitut;
		System.out.println("Swapten sonra");
		
		System.out.println("Sayi1 ; " + sayi1);
		System.out.println("Sayi2 ; " + sayi2);
		
		
	}
}
