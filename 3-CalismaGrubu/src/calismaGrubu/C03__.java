package calismaGrubu;

import java.util.Arrays;

public class C03__ {

	public static void main(String[] args) {
		
		
		String  str="Javacilar cook afilli" ;
		
		String arr[]=str.split("");
		
	        int count[] = new int[256];
	        
	        

	        for (int i = 0; i < str.length(); i++)

	            count[str.charAt(i)]++;

	        System.out.println(Arrays.toString(count));

	        
	        
	        
	        char ch[] = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);

	            int find = 0;

	            for (int j = 0; j <= i; j++) {
	                // If any matches found:Herhangi bir eşleşme bulunursa

	                if (str.charAt(i) == ch[j])
	                    find++;
	            }

	            if (find == 1)
	                System.out.print(str.charAt(i) + "=" + count[str.charAt(i)]+ " ");
	        }
	        
	}
}
