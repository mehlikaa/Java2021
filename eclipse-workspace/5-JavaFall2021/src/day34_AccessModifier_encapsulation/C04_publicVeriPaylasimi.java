package day34_AccessModifier_encapsulation;

public class C04_publicVeriPaylasimi {

	public static void main(String[] args) {
		
		C03 obj=new C03();
		
		System.out.println(obj.isim);		//Ali Can
		System.out.println(obj.maas);		// 10000
		
		obj.isim="Veli Cem";
		obj.maas=15000;
		
		// Baska classtan Gorebilirim ve degistirebilirim.
		
		System.out.println(obj.isim);		//Veli Cem
		System.out.println(obj.maas);		// 15000
		
		
	}

}
