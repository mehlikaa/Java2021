package CB01_EN0204JavaTypeCasting;

public class CB04_BinaryDecimalLogical {

	public static void main(String[] args) {
		int number1=256;
		int number2=0;
		int result=number1&number2;
		System.out.println(result);
		
		// neden 0 ?
		
		number1=3;
		number2=0;
		result=number1&number2;
		System.out.println(result);

		// neden 0 ?
		
		char aLetter ='a';
		byte aNumber2=1;
		result=aLetter & aNumber2;
		System.out.println(result);
		
		//  1    Why? 
		
		
	}

}
