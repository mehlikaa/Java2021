package Day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi=10;
		Integer sayi2=20;
		//sayi1. yazdigimida hic bir method gelmiyor
		// sayi yazdigimida bircok method geliyor ciunku 
		// Integer, wrapper clsstir

		String tel1="3567890";
		String tel2="1234572";
		
		System.out.println(tel1+tel2);  //35678901234572
		
		//toplamak isterseniz
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		//4802462
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE);  //2147483647
		
		System.out.println(Double.MIN_VALUE);  //4.9E-324
		System.out.println(Short.MIN_VALUE);   //-3276
		
		String caddeNo="B203";
		String sokakNo="1564";
		
	
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
	
		//Integer.valueOf(String numerik ifade) methodú string olarak 
	}

}
