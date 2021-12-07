package Day26_Exceptions;

public class EC_me_exceptions {
	
	public static void main(String[] args) {
		System.out.println( " Sayilarin bolumu : "  + division(25,8));
		System.out.println( " Sayilarin bolumu : "  + division(25,0));
		System.out.println( " Sayilarin bolumu : "  + division(16,3));
		System.out.println( " Sayilarin bolumu : "  + division(25,10));
		
		int arr[]= {12, 4, 2, 0, 7};
		System.out.println( " =============  Array  ==================" );
		System.out.println( " Dizi1 Array1 : "  + arraySum(arr,0));		
		System.out.println( " Dizi1 Array1 : "  + arraySum(arr,1));
		System.out.println( " Dizi1 Array1 : "  + arraySum(arr,2));		
		System.out.println( " Dizi1 Array1 : "  + arraySum(arr,3));
		System.out.println( " Dizi1 Array1 : "  + arraySum(arr,4));
	}
	
	public static double division(int a, int b) {
		 
		double result =000.00;
		
		try  { 
			
			result =a/b;		
		}
		catch (ArithmeticException e) {
			System.out.println(" Don't divide 0   " + e.getMessage()+"\n "+ result);
		}
		return result;
	}
	
	public static int arraySum(int arr[], int index) {
		 
		int result =000;
		
		try  { 
			
			// return arr[index]+arr[index+1];
			result=arr[index]+arr[index+1];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Don't use non-existing index : " + e.getMessage()+"\n "+ result);
		}
		return result;
	
	}
	
	
	
}
