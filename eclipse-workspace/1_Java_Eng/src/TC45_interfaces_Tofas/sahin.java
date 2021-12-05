package TC45_interfaces_Tofas;

public class sahin extends TC_Tofas implements IcDonanim,DisDonanim, Lastik{
					
					//2. extends yapamam ve implemeny=ts yapiyorum.
					//sahiní tofas ín cocugu yaptim.
					// override ile motor ve yakitimi aldim
					// implement ile ic donanimdan ozellikler almak istiyorum
				// simdi ya unmplementleri de ekle bunlari da yap yada 
				// yada bunu da (sahini ) de melekler yap abstract olsun
			//source tikla implements metodlardan abstract(tikli) olanlari ekle ekle
	
	@Override
	public void koltuk() {
		// TODO Auto-generated method stub
		System.out.println("Deri koltuk yazin pisirir.");
		System.out.println("Icinde saman olmasin yeter");
		
	}
	@Override
	public void motor() {
		System.out.println("Motor: 1.6 aile motoru");
		
	}

	@Override
	public void yakit() {
		System.out.println("Yakit: Tup takmazsan cooook yakar. ");
		
	}
	@Override
	public void ayna() {
		// metod
		System.out.println("Elektrikli aynalar");
		
		
	}
	@Override
	public void kapi() {
		// metod
		System.out.println("4 kapili");
		
	}
	@Override
	public void kaporta() {
		
		System.out.println("Kordon gibi kaportaya sahip");
		
	}
	@Override
	public void ebat() {
		
		System.out.println("16 inc lastik ebati vardir.");
		
	}
	@Override
	public void jant() {
		
		System.out.println("Celik jant kullanilmistir.");
		
	}



	
	
}
