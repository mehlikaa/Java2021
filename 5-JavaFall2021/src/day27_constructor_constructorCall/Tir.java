package day27_constructor_constructorCall;

public class Tir {
		

		int yil = 2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		public Tir(int i, String string, String string2, int j, boolean b) {
			// Tir Runner claassindan dan yolladigimiz  degerlerin instance variable 
			// atamalari yapmam lazim 
			
			km=i;
			model=string;
			renk=string2;
			yil=j;
			satilikMi=b;
			
	}

		// public Tir(int i, String string, String string2) {
			// i, string string 2 anlasilir guzel degil
			// variable isimlerini anlamli yapalim.
			// ustteki ismlerle ayni, ama eslesmiyor scope
		public Tir(int km, String model, String renk) {
			this.km=km;
			this.model=model;
			this.renk=renk;
			
			//basina this yazdigimizda, class leveldaki old anlar.
		}

		Tir() {

		}
	}


