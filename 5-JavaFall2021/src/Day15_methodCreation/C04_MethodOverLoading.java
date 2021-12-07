package Day15_methodCreation;

public class C04_MethodOverLoading {

	public static void main(String[] args) {
		// Ayni isimde, birden fazla method olur mu?
		// cevap evet
		// ayni isimde birden fazla method olursa Java hang's'n'calistiracagina nasil karar verir?
		
		String str="Java harika";
	
		int sayi1=4;
		int sayi2=5;
		int sayi3=10;
		int sayi4=20;
		
		topla(sayi1,sayi2);
		topla(sayi1,sayi2,sayi3);
		topla(sayi1,sayi2,sayi3,sayi4);
		

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		// 4 sayiyi topla
		System.out.println("4 sayinin toplami : "+(sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		// 3 sayiyi topla
		System.out.println("3 sayinin toplami : "+(sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {
		// 2 sayiyi toplama
		
		System.out.println("2 sayinin toplami (ii): "+(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, int sayi2) {
		// 2 sayiyi toplama
		
		System.out.println("2 sayinin toplami (di) : "+(sayi1+sayi2));
		
	}
	private static void topla(int sayi1, double sayi2) {
		// 2 sayiyi toplama
		
		System.out.println("2 sayinin toplami (id) : "+(sayi1+sayi2));
		
	}
	private static void topla(double sayi1, double sayi2) {
		// 2 sayiyi toplama
		
		System.out.println("2 sayinin toplami (dd): "+(sayi1+sayi2));
		
	}
}
