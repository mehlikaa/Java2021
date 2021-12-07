package Day26_Exceptions;
	/* 1) What is exceptions: Unexpected issues
	 * 2) When there is an exception
	 * 		java throws exception 
	 * 		java stops executing the rest of the codes.
	 * 3) we can handle exceptions using try-catch blocks
	 * 4) I can't use try alone. try block can't be used alone, there must be catch or some other structure
	 * 5) there can be multiple catch blocks after try block
	 * 6) catch exceptionsorder can be changed. Totally different  
	 * 		i) if there is no parent-child relation between exception classes, 
	 *         then the order of the catch blocks is not important
	 * 	   ii) if there is parent-child relation between exception classes, 
	 *         then the child class exception must be first 
	 *     
	 */

public class EC01_Exceptions {

	public static void main(String[] args) {
		
		System.out.println(division(12,4));
		System.out.println(division(0,5));
		System.out.println(division(8,3));
		System.out.println(division(5,0));   //arithmetic exception
		System.out.println(division(25,10));
		System.out.println("=====================");
		
		
		
		int arr[]= {4,2,5,6,7};
	
		System.out.println(arraySumOfTwoConsecutiveElements(arr,0)); //6
		System.out.println(arraySumOfTwoConsecutiveElements(arr,1));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,2));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,3));
		System.out.println(arraySumOfTwoConsecutiveElements(arr,4)); // hata verir siniri astin
		System.out.println("=====================");
		
		int brr[]= {12, 4, 2, 0, 5};
		
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,0));// 3.0
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,1));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,2));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,3));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr,4));       // error ArrayIndexOutOfBoundsException
	}
	
	public static double division(int a, int b) { //mainden cagirabilmek icin bu da static olmali
								//try catch structure
		
		double result=0;        // container result
		try {     				// try operation, division 
			
			result=a/b;
			
		}             					       // if you can not do this I will catch this problem and fix the issue how
			 catch (ArithmeticException e) {   // with catch metod. with exception type
				
				 System.out.print("Do not divide by zero"+e.getMessage());	// you will see exception error message
				 			// Aritmetic exception is a class. e is an object name. e is error kisaltmasi olabilir
				 			// getmessage tekniki hata mesajini yaszdirir
			}
			return result;
		}
		
		
		
		// what is the purpose try catch 
		// How it help us
	//hatadan sonra kalir sonrasini isleyemezdi, simdi hatayo kendi cozup sonrasini da isler
		
		
		
	  /* 0'a bolenme hatasini kaldirmak icin, bu yontem kullanilabilir yada ustteki
		if (b==0) {  
			System.out.println("Do not divide by zero");
			return 0;
		} else { 
			return a/b;
		}
	  */

		// sadece    return a/b;     yazdigimizda, 0á bolunme hata verir.
		 //(5,0) yazildiginda, Aritmetic exception hatasi 
		//   / by zero tanimlayamiyor. Java throws exception: run time error
		
	
	public static int arraySumOfTwoConsecutiveElements(int arr[], int index) {
		int result=0;
		
		try {
	
			return arr[index]+arr[index+1];
	
		}	catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Do not use existing index : "+e.getMessage());   //teknik message
		
		}return result; 
		
		// return arr[index]+arr[index+1];    // indexi 4 yazdigimizda hata veriyor
											// ArrayIndexOutOfBoundsException hatasi verir.
	
	}
	
	public static double arrayDivisionOfTwoConsecutiveElements(int brr[], int index) {
		double result=0;              // container result
		try {     				      // try operation, division 
			
			result=brr[index]/brr[index+1];
			
		}     catch (ArithmeticException e) {   
				
				 System.out.print("Do not divide by zero"+e.getMessage());	// you will see exception error message
				 			
			} catch (ArrayIndexOutOfBoundsException e) {   
				
				 System.out.print("Do not use non-existing index : "+e.getMessage()+"\nDefault deger : ");	// you will see exception error message
				 			
			}
			return result;
		}
	
	}


