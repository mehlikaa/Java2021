package Day31_colllections;
							//Nov19 online ok
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class EC04_QueueDeque {

	public static void main(String[] args) { 
		//Queue ==> FIFO
		//If the constructor is LinkedList, then the elements are in insertion order
		Queue <String> q1=new LinkedList<>();
		
		//If the constructor is PriorityQueue, then the elements are
		// in natural order or in an order that Java creates
		
		Queue<String> q2=new PriorityQueue<>();
		System.out.println(q1.offer("a"));		   //true-- if there is place in capacity, or it won't be added
		System.out.println(q1);				//[a]
		
		
		//Deque ==> FIFO+LIFO
		Deque<String> d1=new LinkedList<>();
		d1.addFirst("A");
		d1.addFirst("B");
		d1.addFirst("C");
		d1.addLast("D");
		System.out.println(d1);       //  [C, B, A, D]
		
		
	}

}
