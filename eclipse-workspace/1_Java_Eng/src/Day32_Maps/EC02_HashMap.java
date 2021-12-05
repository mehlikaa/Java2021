package Day32_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EC02_HashMap {

	public static void main(String[] args) {
		// Print all entries of the hashmap hm1={ali=3.,Veli=5, Can=7} 
		// on the console in different lines

		HashMap <String,Integer> hm1=new HashMap<>();
		hm1.put("Ali",3);
		hm1.put("Veli",5);
		hm1.put("Can",7);
		System.out.println(hm1);		// {Can=7, Veli=5, Ali=3}
		
		// Set<String,Integer> setOfEntries = hm1.entrySet();
		// how do we solve this problem, you will go to metod and check
		Set<Map.Entry<String,Integer>> setOfEntries=hm1.entrySet();
		System.out.println(setOfEntries);	// [Can=7, Veli=5, Ali=3]
					// declarationdan kopyalandi
		//for (w:setOfEntries) {  //complaining : Type mismatch: cannot convert from element type Map.Entry<String,Integer> to w
								//  
								// Map.Entry<String,Integer and w not same type
			
		
		
		for(Map.Entry<String,Integer> w:setOfEntries) {
					// data type of entry
			System.out.println(w);
			System.out.println('a'+'b');
			
		}
		
		
		
	}

}
