package CB01_EN0204JavaTypeCasting;

public class CB03_Logical_Operators {
	public static void main(String[] args) {
		// Logical operators
		//&& (And)  || (Or)
		
		boolean boolean1=true;
		boolean boolean2=false;
		
		boolean result=boolean1&&boolean2;
		System.out.println(result);      // false
		
		boolean1=true;
		boolean2=true;
		result=boolean1&&boolean2;
		System.out.println(result);   //true
		
		boolean1=true;
		boolean2=true;
		result=boolean1||boolean2;
		System.out.println(result);   //true
		
		boolean1=true;
		boolean2=false;
		result=boolean1||boolean2;
		System.out.println(result);   //true
		
		boolean1=false;
		boolean2=false;
		result=boolean1||boolean2;
		System.out.println(result);     //false
		
		
	}
}
