package CB01_EN0204JavaTypeCasting;

public class CB05_Binary_OR_Logical {

	public static void main(String[] args) {
		
		int number1=256;
		int number2=0;
		int result=number1 | number2;
		System.out.println(result);
		
		// neden 256 ?
		
		number1=3;
		number2=0;
		result=number1 | number2;
		System.out.println(result);

		// neden  3 ???
		
		char aLetter ='a';
		byte aNumber2=1;
		result=aLetter | aNumber2;
		System.out.println(result);
		
		// NEden 97
		
		aLetter ='a';
		aNumber2=0;
		result=aLetter | aNumber2;
		System.out.println(result);

	}

}
