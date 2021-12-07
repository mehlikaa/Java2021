package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		
		// verilen sayilari toplayan bir metod olusturmak istiyorum
		// degisken sayida parametre girmek istersek, suana kadar gordugumuz tekniklerle  tek metodda halledemeyiz
		// Varargs
		
		// Variety Arguments 
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		topla(a,b);
		topla(a,b,c);
		topla(a,b,c,d);
		topla(a,b,c,d ,e);
	

	}

	private static void topla(int a, int b) {
		// 2 degiskenli 
		System.out.println("Iki degiskenli  ile yapilan");
	}

	private static void topla(int ... a) {
		
		System.out.println("Varargs ile yapilan");
		
	}



}
