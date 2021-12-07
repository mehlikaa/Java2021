package day34_AccessModifier_encapsulation;

public class C05 {

	private int asgariMaas = 4000; // default olmasi icin private /public yazmadik

	public static void main(String[] args) {

		// bir classdaki herhangi bir calss uyesine ulasilsin ama degistirilemesin,
		// denirse
		// 1- private yapilir. ama hic ulasilamaz.
		// private class yerine hicbirsey le ulasim olamayacagindan sadece gorebilme
		// yeyetkisi
		// getter() metodu ile yapilir.

	}

//getter metodu geldi, source dan
	public int getAsgariMaas() { // gorulsun ama degismesin

		return asgariMaas;

	}

}
