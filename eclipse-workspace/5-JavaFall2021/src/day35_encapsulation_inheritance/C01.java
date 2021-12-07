package day35_encapsulation_inheritance;

public class C01 {

	private double not=50;	

	private boolean gecerMi=false;

	
	
	
	public void setNot(double not) {		//baska classlardan argument olarak yazilan degerler bu metoda parametre olarak gelecek
															// bilgi gelecek
		this.not = not;
	}

	public boolean isGecerMi() {
		if(not>-50) 
			gecerMi=true;
			
			return gecerMi;
	}

//	public void setGecerMi(boolean gecerMi) {       degisim degil sadece gorsun
//		this.gecerMi = gecerMi;
//	}
	


	
	
	
	
}
