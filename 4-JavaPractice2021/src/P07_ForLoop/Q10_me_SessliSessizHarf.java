package P07_ForLoop;

import java.util.Iterator;
import java.util.Scanner;

// ---- me ok ----//
public class Q10_me_SessliSessizHarf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Bir harf giriniz ");
		String harf = scan.next().toLowerCase();

		String sesliHarf = "aeuoi";
		String sessizHarf = "bcdfghjklmnprstvyzxwq";

		if ((harf.charAt(0) >= 'A') && (harf.charAt(0) <= 'z')) { // bu bir harf ise
			if (harf.length() == 1) {
				for (int i = 0; i < sesliHarf.length() - 1; i++) {
					if (sesliHarf.contains(harf)) {
						System.out.println("Harfimiz; sesli harftir.");
						break;
					} else if (sessizHarf.contains(harf)) {
						System.out.println("SS Harfimiz; sessiz harftir.");
						break;
					} else {
						System.out.println("Yanlis mi oldu?");
					}
				}
			} else {
				System.out.println("Lutfen tek karakter giriniz");
			}
		} else {
			System.out.println("Harf karakterlerinden birini giriniz.");
		}
	}
}
