package Day20_scope;

public class InstanceVar {
                 //classin icinde main disinda
	int notMat=50;
	int notFen;		//instance veri de deger atamak sart degil
	
	// instance variablelarin scopeunda main metod yoktur. 
	//instance variablelardan main metoddan direk ulasamayiz/
	// objeler olusturmaliyiz. object variables.
	
	
	
	
	public static void main(String[] args) { //mutlaka olmali, olmayabilir de
		// System.out.println(notMat); //yazdirmaz , main static ve stati colmayan variablelar
// instance variablelara main metod ile ulasmak istersek obje olusturup 
		// obje uzerinden erisim saglanabilir
		//nasil olusturuyorduk ?
		
		//Scanner scan=new Scanner(System.in);
		// class  obje anahtar
		 // ismi  ismi kelime
		// icinde old classtan bir obje olusturalim
	 
	InstanceVar celil=new InstanceVar();   //celil adinda obje olustu, artik metod ve notlara , static olmayanlara ulasabiliriz
	 
	System.out.println(celil.notMat);    //50-problem yok. static olmayan veriablea ulasabildim
	 
	InstanceVar nihal=new InstanceVar();
	 nihal.notMat=70;
	 System.out.println("Nihal not : "+ nihal.notMat);
	 //instance variablelarda deger atanmazsak, java instance olarak atanan edgeri alir.
	 // bu class icin notMat=50 gibi. biz celile not belirlemedik ama eski degeri aldi
	 // istersek atayabiliriz., deger atadigimiz obje icin yeni deger gecerli olur.
	 //nihalin notu celili baglalamz celil hala 50
	 
	 System.out.println( "Celil not : "+ celil.notMat);	//50
	 celil.notMat=85;
	 System.out.println( "Celil not : "+ celil.notMat);	//85
	 
	 //   method2();   		// method2 static degil ve direk cagirilamaz.
	 celil.method2();   	// sadece celil icin calistirir	
	
	}
	
	public static void staticMethod() {   //metodlar; static olabilir olmayabilir
		
		// instance veralelara static metodlardan direk ulasilamaz.obje olusturulabiolir
		// System.out.println(notFen);
		
	}
	
	public void method2() {
		//metod static olmadigi icin kabul etti.
		//instance variable icin olusturulurken deger verlmese de olur. default degerler atar. int icin 0.
		System.out.println("Metod 2: "+ notFen);
		notFen = 100;
		System.out.println("Metod 2: "+ notFen);
		
	}

}
