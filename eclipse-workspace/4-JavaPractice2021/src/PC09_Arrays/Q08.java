package PC09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

    	String str="$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
    	
    	String arr[]=str.split(" ");
    	
    	System.out.println(Arrays.toString(arr));
    	
    	int toplamDolar=0;
    	int toplamSterlin=0;
    	
    	for (int i=0;i<arr.length;i++) {
    		if (arr[i].contains("$")) {
    			toplamDolar+=Integer.parseInt(arr[i].replace("$","")); //int repor classtan inte cevir
    			
    		}else {
    			toplamSterlin+=Integer.parseInt(arr[i].replace("£",""));
    	}
    	}
    	System.out.println("Toplam Dolar : "+toplamDolar);
    	System.out.println("Toplam Sterlin : "+toplamSterlin);
    }
}


