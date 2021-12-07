package calismaGrubu;

import java.util.Arrays;

public class C03 {

	public static void main(String[] args) {
		
		
		// kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		String  str="Javacilar cook afilli" ;
		String arr[]=str.split("");
		
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String c="";
		
		for (int i=1; i<arr.length-1;i++) {
			
				if(!arr[i].equals(arr[i-1])) {
					c+=arr[i];
					
				}
		}
		
		System.out.println(c);
		System.out.println(arr.length);
		
		System.out.println(c);
	
	
	
	}

}
