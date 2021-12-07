package day34_AccessModifier_encapsulation;

public class C03 {

	public String isim="Ali Can";
	public int maas=10000;
	
	public static void main(String[] args) {
		
		C03 obj=new C03();
		System.out.println(obj.isim);		//Ali Can
		System.out.println(obj.maas);		// 10000
		
	}

}
