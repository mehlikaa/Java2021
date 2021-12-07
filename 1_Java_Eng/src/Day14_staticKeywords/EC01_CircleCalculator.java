package Day14_staticKeywords;
/*Static block: 1) We use static block to initialize static variables
			 	2) If you use static block to initialize a static variable,
				it will be initialized before everything inside the class.
				
*/
public class EC01_CircleCalculator {

	static String nameOfShape="circle";
	static double pi;
	static String unit;
	
		
		static {     //static block with curly braces
			pi=3.14;
			System.out.println("This is static block--1");
			
		}
		
		static {     
			unit="cm";
			System.out.println("This is static block--2");
			
		}	
		
		public EC01_CircleCalculator() {     
			System.out.println("This is constructor");
			
		}
		
		
		public static void main(String[] args) {
			System.out.println("This is Main method");
			method();
			
			EC01_CircleCalculator obj=new EC01_CircleCalculator();
			
		}
		public static void method() {
			System.out.println("METhod");
		}
// First, static block runs then main method
		// because everything something else run 
		//  then main method runs
		
		// first, static block starts before everything 
		// after main method runs and
		// it will follow the lines
}
