package Day04_Monday_Oc25;

public class C06_Predecrement_Postdecrement {
	
	public static void main(String[] args) {
		
		int sayi=10;
		sayi--;
		
		System.out.println(sayi); // 9
		
		int a=sayi--;  // 2 islem var. 1 atama 2 azaltma a=9
		System.out.println(a);
		
		System.out.println(sayi); //8
		
		System.out.println(sayi--);  //8 yazdir sonra azalt 7
		
		System.out.println(--sayi);      //6
		sayi--;
		System.out.println(sayi);
	}

}
