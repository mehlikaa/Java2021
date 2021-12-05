package Day06_wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		
		System.out.println(5+3==8 || 6+5==10 || 7-2==3);  //true
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc=a>b || b>c ||a+b>=c ;
		
		System.out.println(5+3==8 && 6+5==10 && 7-2==3) ;    //false
		// 2. islemde falseu gorunce 3.islemi yapmaya gerek duymaz

		// && isareti &de kullanilabilir ancak arada bir nuans var
		// && isareti il falseí buldugunda islein false olacagini bilir
		// ve geri kalani kontrol etmedeenn sonucu yazdiri.
		//& ise once tum islemleri bitirir, bir false var ise  ve sonucu( false) olarak yazdirir.
		
		System.out.println(5+3==8 & 6+5==8 & 7-2==3);     //false
		// butun islemleri yaptirir. usttekine gore yani isi daha fazla calisarak yapar.
		
		int yas=50;
		int boy=180;
		char cinsiyet='M';
		System.out.println(yas<30 && boy>170 && cinsiyet == 'M');  //false
		
	}

}
