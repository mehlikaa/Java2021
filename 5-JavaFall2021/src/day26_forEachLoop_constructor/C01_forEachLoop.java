package day26_forEachLoop_constructor;

public class C01_forEachLoop {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array’lerdeki ortak elemanlari
		// For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		// Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

		String arr1[] = { "A", "C", "B" , "c"};
		String arr2[] = { "A", "R", "O", "c" };

		int flag = 0;

		for (String e1 : arr1) {
			for (String e2 : arr2) {

				if (e1.equals(e2)) {
					System.out.println("Esit elemanlar : "+e1 + " ");
					flag++;
				}

			}
		}
		if (flag == 0) {
			System.out.println(" Ortak eleman yok");

		}
	}

}
