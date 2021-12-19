package day44_Iterator;
		
import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		
		 List <Integer> liste=new  ArrayList<>();
		
		 liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		System.out.println(liste);
		//index kullanmadan tum elemenlari 3 eklenmis olarak yazdirin. 
	
	for(Integer each:liste) {
		each+=3;
		System.out.print(each+"  ");
		
	
		// System.out.print(each+3+"  "); sonuc degismiyor. atama ile liste degerleri degistirmiyor
	}
	for (int i = 0; i < liste.size(); i++) {
	liste.set(i,( liste.get(i)+3));
	}
	
	System.out.println("\n Son"+liste);
	
	
	
	}

}
