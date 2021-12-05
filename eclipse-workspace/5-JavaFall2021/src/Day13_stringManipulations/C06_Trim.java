package Day13_stringManipulations;

public class C06_Trim {

	public static void main(String[] args) {
		// trim() ile, String'in basinda ve sonundaki
		// bosluklari atabiliriz

		String cumle="     Bence Java hep cok zevkli      ";
		
		System.out.println(cumle+"\n");
		System.out.println(cumle.length());
		
		cumle=cumle.trim();
		
		System.out.println(cumle+"\n");
		System.out.println(cumle.length());
		
	}

}
