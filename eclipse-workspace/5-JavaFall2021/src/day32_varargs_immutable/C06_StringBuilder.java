package day32_varargs_immutable;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str="Ali Can";
		String str2=new String("Veli Cem " );
		
		StringBuilder sb2=new StringBuilder();   // 16 karakter atar capcitesi
		StringBuilder sb=new StringBuilder("Yasasin Java");
		
		//hic bir class bosuna olusturulmamistir.
		
		 sb.append("!!!"); 
		 System.out.println("String Builderimiz : "+sb);
		 // problemi Thread safe degil 
		 // manipulayon ozeeligi az ama .toString(). denince butun manipulation acilir
		// ama stringe donusur yine atamsiz havada islem olur
		 // sb'ye tostringden sonra sbye atayamayiz. sen artik stringsin farklisin der kendine atanamaz
		 // yeni bir string sb2= olustuurup atanabbliir//
	
		 // bu atamasiz islem, stringde syso'ya yazdirirken gecerli olmazdi ve havada kalirdi
		 
		 // stringbuilderda atamasiz icerigi degisir.
		 
	}

}
