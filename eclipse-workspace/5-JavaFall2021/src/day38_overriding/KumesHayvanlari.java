package day38_overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();     //animalsdan aliyor
		kms1.hareket();      //kendi classin da var parenta gitmz
		kms1.solunum();       // bir ust parentta var ustte gitmem
		
		
		Kuslar kms2=new KumesHayvanlari();
		
		kms2.beslenme();			//animals
		kms2.hareket();				//kuslar		degil kendi clasindan aldi.
		kms2.solunum();			//kuslar
	
	
		Kuslar kms3=new Kuslar();
		
		kms3.beslenme();			//animals
		kms3.hareket();				//kuslar		
		kms3.solunum();			//kuslar
		
		// Constructor , child classtan ve 
		// datatype parenttan secerseniz, biz parenttan baslariz.
		// java kuslardan alicam dedi ama overiding icin istisna var. 
		// Overridig var, ben specifiki dikkati almaliyim der.
		//@ Overriden notasynu bu yuzden onemli
		//Java bilir ama sonradan kodu calisanlar icin onemli
		
		Animals kms4=new KumesHayvanlari();
		kms4.beslenme();//animals
		kms4.hareket(); 	//animals dedei ama metodumuz kumes ve override 
		kms4.solunum();    //animals
	
	}

	// hatta overridelari sira numara yaninda cikan ucgenden de okunabilir.
	
	@Override
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder.");
	}


}
