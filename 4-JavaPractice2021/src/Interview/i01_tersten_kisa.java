package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class i01_tersten_kisa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Bir metin giriniz :");
		String cumle = scan.nextLine();

		String arr[] = new String[cumle.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = cumle.substring(cumle.length() - 1 - i, cumle.length() - i);
		}

		System.out.println("== Simdi tersten okuyalim ==");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
