package day45_LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		

		List <Integer> ll=new LinkedList<>();

		ll.add(5);
		ll.add(7);

		System.out.println("LinkedList "+ll);	// [] constructorim degismemek uzere data turunu degistirebilir miyim?
		
		//data turunu List sectigimiz icin sadece list interfaceinin metodlarini kullanabiliriz.
		// LinkedList claassinda override ettigimiz icin
		// list interface olmasina ragmen list metodlarini kullanabildik
	
	Queue<Integer> ll2=new LinkedList<>();
	
	ll.clear();    //data turu q secilince Queue interfaceinden gelen metodlari kullanabildik.
	ll2.peek();
	
	Deque<Integer> ll3=new LinkedList<>();
	
	ll3.addFirst(5);
	
	// queue nin ozellikleri gerekli ise o secilmeli, metodlari
	System.out.println(ll3.hashCode());
	
	
	}

}
