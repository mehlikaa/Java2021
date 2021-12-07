package HB05_StringManipulationHB;

public class Q05_parseInt_toString_repaceAll_stringInteger_cevir {
    public static void main(String[] args) {
    /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
    //--me

    		String str1="%13.99";
    	    String str2= "%10.55";
    	    
    	   // str1=str1.replaceAll("\\D",""); // sayi disindakileri hiclige cevirdi.
    	   // str2=str2.replaceAll("\\D","");
    	   
    	
    	   System.out.println("Sayilarimiz :"+ (str1+" ve "+str2));
    	   System.out.println("Toplamlari : "+ (Integer.parseInt(str1.replaceAll("\\D",""))+Integer.parseInt(str2.replaceAll("\\D",""))));
    	    
    	   System.out.println("Tek yazdirmada, Toplamlari : "+ (Integer.parseInt(str1.replaceAll("\\D", ""))+Integer.parseInt(str2.replaceAll("\\D", ""))));
      
    	   int x=5;
    	   int y=10;
    	   
    	   System.out.println(" Sayilari Integer Topla : "+(x+y)+ "\nString Topla: "+(Integer.toString(x)+Integer.toString(y)));
    	   
    	   // ---- me ----
    }
}
