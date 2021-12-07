package Day27_Exceptions;

public class EC01_Exceptions {

	public static void main(String[] args) {
		// ArirthmeticExceptions and arrayoutof bound gormustuk
		// 
		String s1="Aliye Can";
		String t1="Ali";
		divideLength(s1,t1);       // Result : 3
		
		String s2="";
		String t2="Ali";
		divideLength(s2,t2);       //Result : 0
		
		String s3="Aliye Can";
		String t3="";
		divideLength(s3,t3);       //Result : Hata ArithmeticException
		
		String s4=null;		// it is not a string
		String t4="Ali";
		divideLength(s4,t4);       //Result : NullPointerException hata
	}
	
	//create a method to divide the length of 2 given strings
	public static void divideLength(String s, String t) {
	
		try {
			int result =s.length()/t.length();
			System.out.println("RResult : "+result);
			} catch(ArithmeticException e) {
				System.out.println("Don't divide by zero : "+e.getMessage());
			} catch(NullPointerException e) { 
				System.out.println("Null does not have length : "+e.getMessage());
			}
		}
		
		
		// System.out.println("Result : "+result);    // Result : 3
	}


