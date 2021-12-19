package day45_LinkedList;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		

		LinkedList <Integer> ll=new LinkedList<>();

		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);
		
		System.out.println(ll.peek());		//5
		System.out.println(ll.peekFirst());		//5
		
		LinkedList <Integer> ll2=new LinkedList<>();
		
		System.out.println(ll.peek());		//Null			queueden
		System.out.println(ll.peekFirst());		//Null		deque
		
		ll.element();   //yoksa nosuchelement exception dondurumus.
		System.out.println(ll.element());  //the head of the list

		ll.poll();	
		System.out.println(ll);
		System.out.println(ll.poll()); //sil gtir
		
		System.out.println(ll.poll());  //null kaldi
		
		System.out.println(ll.hashCode());			
		//hash code Javanin bu listeye verdigi hash code, referans denemez.
		System.out.println(ll.offer(8));   //8 ekledi ve basarili true
														// true
		ll.push(5);    //bsasa ekle
		System.out.println(ll);		// [5, 8]
	}
}
