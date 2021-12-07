package Day11_;

public class C02_equalsIgnore {

	public static void main(String[] args) {
	
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4 = str1+" "+str2;
		
		System.out.println(str4);       // ali can
		System.out.println(str3==str4);       // false, hem degerler hem referans farkli
		System.out.println(str3.equals(str4));  //degerler , cikti farkli

		System.out.println("*******");
		
		System.out.println(str3.equalsIgnoreCase(str4)); //buyuk kucuk harfi onemseme
														// case sensitiveí ortadan kaldirir
	// equalsIgnoreCase ; case sensitive ortadan kalkar
		//icerik ayni mi?yeter
	}

}
