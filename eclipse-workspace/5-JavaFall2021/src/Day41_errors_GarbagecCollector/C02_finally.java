package Day41_errors_GarbagecCollector;

public class C02_finally {

	
	public static void main(String[] args) {
		
		///    Errorlar ongorulemez bilinemz
		
		for (int i = 0; i < 10 ; i--) {
			i--;
		}
		System.out.println(C01_Exceptions_final.pi);
		
		// C01_Exceptions_final.pi=4.13; final yaptigimiz icin, deger degistiremeyiz.
														// heryerden uasilir ama degismez
		
	}
	
	

}
