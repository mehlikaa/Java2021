package Day32_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* 1) Map use key-value structure
		 * 2) "key"s must be unique, "value"s can be duplicated
		 * 3) "key"s can't be null except in "HashtaMap", it can have just once
		 * 4) "values" can use null many times
		 * 
		 *  5) HashMap is the fastest one.does not put elements in any order,
		 *     because of that it is too fast
		 *  6) If you send another value to a key, it overwrites new value
		 *  
		 */
		
public class EC01_HashMap {

	public static void main(String[] args) {
		
		// Map is not a collection, like too dimensional
		//two value type
		HashMap <Integer,String> hm1=new HashMap<>();
		 //how to add elements to a HashMap
		hm1.put(100,"Ali");
		hm1.put(101,"Veli");
		hm1.put(102,"Mete");			//call the elements is ENTRY have key and value
		
		System.out.println("hm1 : "+hm1);		// {100=Ali, 101=Veli, 102=Mete}
		
		hm1.put(102,"Efe");
		System.out.println("hm1 : "+hm1+"              -- (change 102)");		// {100=Ali, 101=Veli, 102=Efe}
		
		hm1.put(104,null);			// null is ok
		System.out.println("hm1 : "+hm1+"     -- null is ok  ");	// {100=Ali, 101=Veli, 102=Efe, 104=null}
		
		hm1.put(104,"");			//  ""is ok
		System.out.println("hm1 : "+hm1+"         -- \"\"is ok  ");	// {100=Ali, 101=Veli, 102=Efe, 104=}
		
		hm1.put(105,"Ali");			// value can be repeated
		System.out.println(hm1);		//{100=Ali, 101=Veli, 102=Efe, 104=, 105=Ali}
		
		// New HashMap hm2
		HashMap <Integer,String> hm2=new HashMap<>();
		hm2.put(200, "X");
		hm2.put(201, "Y");
		System.out.println(hm2); 		//{200=X, 201=Y}
		
		//if you use putAll()., data types of key and value  must match, otherwise it gives 
		// compile time error
		hm2.putAll(hm1);
		System.out.println("hm2"+hm2);  		// {100=Ali, 101=Veli, 102=Efe, 200=X, 104=, 201=Y, 105=Ali}
	
		// if absent 106 key, it adds
		hm1.putIfAbsent(106, "Efe");
		System.out.println("hm1 : "+hm1); 
		//  normally it overwrite,ali become alex,
		//but if it exist it doesn't change,100 exists and it doesn't change
		hm1.putIfAbsent(100, "Alex");
		System.out.println("hm1 : "+hm1);			// hm1 : {100=Ali, 101=Veli, 102=Efe, 104=, 105=Ali, 106=Efe}
	
		// how to remove element from HashMap
		String val1=hm1.remove(100);  //return value
		System.out.println(val1);				//Ali
		System.out.println(hm1);
		
		
		boolean val2=hm1.remove(101, "Veli");		//veli //return boolean
		System.out.println(val2);				//true
		System.out.println(hm1);
		
		boolean valx=hm1.remove(100, "Veli");		//100 no exist
		System.out.println(valx);				//false
		System.out.println(hm1);
				
		//how to get data from HashMap
		String val3=hm1.get(102);
		System.out.println("val3: "+ val3);
		System.out.println(hm1);
		
		String val4=hm1.get(400);		//null:  for non-existing key, it returns null
		System.out.println(val4+ "          <==Not exist ");
		
		String val5=hm1.getOrDefault(102, "The key is missing");      // if does not exist what do you want to write message
		System.out.println(val5+ "                   <== The key is not missing   ");
		
		String val6=hm1.getOrDefault(500, "The key is missing");      // if does not exist what do you want to write message
		System.out.println(val6+   "          <== The key is not missing");
	
		Set<Integer> keys01=hm1.keySet();				// unique elements is set
		System.out.println(keys01);				// [102, 104, 105, 106]
		//CHECK ????
		// Set<Integer> keys011=hm1.keySet();
		//System.out.println(keys011);            //I get collections of string
							// Why do i have collections (not set)?values can be dublicated
		Collection<String> values01=hm1.values();   //[102, 104, 105, 106]
		System.out.println(values01);  				// [Efe, , Ali, Efe]
		
		// How to update
		String val7=hm1.replace(102, "Han");
		System.out.println(val7); 			//Efe
		System.out.println(hm1); 	// efe upadted to Han: {102=Han, 104=, 105=Ali, 106=Efe}
		
		String val8=hm1.replace(400, "Han");
		System.out.println(val8); 			//null non existing index is null
		System.out.println(hm1);			// {102=Han, 104=, 105=Ali, 106=Efe}
		
		boolean val9=hm1.replace(105, "Ali", "Efe");
		System.out.println(val9); 			//true
		System.out.println(hm1);			// {102=Han, 104=, 105=Efe, 106=Efe}
		
		boolean val10=hm1.replace(500, "Ali", "Efe");			//non existing index returns null
		System.out.println(val10); 			//false

		boolean val11=hm1.replace(201, "A", "Efe");			//non existing index returns null
		System.out.println(val11); 			//false
	}

}
