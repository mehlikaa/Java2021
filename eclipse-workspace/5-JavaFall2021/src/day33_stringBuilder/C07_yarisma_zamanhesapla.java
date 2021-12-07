package day33_stringBuilder;

public class C07_yarisma_zamanhesapla {

	public static void main(String[] args) {
			
				// Soru : For loop ile 1000 defa bir islem yapalim. 
				// Oncesinde ve sonrasinda zamani kontrol edip 
				// StringBuilder ve String class’larinin performanslarini karsilastiralim. 
				
				// Ipucu:  long TimeSb = System.nanoTime();  kullanalim
				
				
				String str= "Merhaba";
				StringBuilder sb = new StringBuilder("Merhaba");
				sb.trimToSize(); // capacity'i length boyutuna indirir
				
				long time1=System.nanoTime();
				
				for (int i = 0; i < 1000; i++) {
					str+=" ";
				}
				
				
				long time2=System.nanoTime();
				long stringSure=time2-time1;
				
				
				long time3=System.nanoTime();
				
				for (int i = 0; i < 1000; i++) {
					sb.append(" ");
				}
				
				
				long time4=System.nanoTime();
				long sbSure=time4-time3;
				
				if(sbSure>stringSure) { 
					System.out.println("String daha hizll");
				} else { 
					System.out.println("StringBuilder daha hizll");
				}
				System.out.println("StringBuilder Sure : "+sbSure);
				System.out.println("String sure: "+stringSure);
				
				System.out.println("StringBuilder/String : "+stringSure/sbSure);
				
	}

}
