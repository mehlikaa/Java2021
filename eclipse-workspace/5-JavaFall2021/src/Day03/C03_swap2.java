package Day03;

public class C03_swap2 {
	public static void main(String[] args) {
		// 3. bir variable olmadan swap yapma
		int sayi1 = 10;
		int sayi2 = 20;
		
		System.out.println("1. sayimiz : " + sayi1);
		System.out.println("2. sayimiz : " + sayi2);
		
		System.out.println("3. variable olmadan swap time");
		
		sayi1 = sayi2 - sayi1;
		/* farkindan yararlanalim. aradaki farki bulalim.
		 * fark olan sayi1 ile sayi2 toplanir.
		 * 
		 */
		sayi2 = sayi2-sayi1;
		
		System.out.println("1. sayimiz : " + sayi1);
		System.out.println("2. sayimiz : " + sayi2);
		
		sayi1= sayi1+sayi2;
			
		System.out.println("1. sayimiz : " + sayi1);
		System.out.println("2. sayimiz : " + sayi2);
	}
}
