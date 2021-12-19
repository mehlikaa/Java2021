package day45_LinkedList;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		
		LinkedList <Integer> ll=new LinkedList<>();

		ll.add(5);
		ll.add(7);
		// liked listin iki tane interface parenti vardir
		// biri, list ve digeri deque==>queue //list interfaceden gelen ozellik
		
		ll.add(0,10);
		System.out.println("LinkedList "+ll);		      //LinkedList [10, 5, 7]
		ll.addFirst(90); //queue interfaceden gelen metod
		ll.addLast(1010);
				
		System.out.println("LinkedList "+ll);            //LinkedList [90, 10, 5, 7, 1010]
		ll.add(3,53);
		System.out.println("LinkedList   "+ll); 			//LinkedList [90, 10, 5, 53, 7, 1010]
		
		LinkedList <Integer> ll2 =new LinkedList<>();
		ll2.addAll(ll);
		System.out.println("LinkedList2  "+ll2); 	 //eskimlisteyi kopyaladu
		ll2.addAll(2,ll);
		System.out.println("LinkedList2  "+ll2); 
	}

}
