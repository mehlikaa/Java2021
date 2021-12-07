package Day13_stringManipulations;

public class C04_replaceAll {

	public static void main(String[] args) {
		
		//replaceAll
		
		// replace de tek tek belirtmrniz gerkeiyor.
		// replaceAll genelleme yaparak ifade edebilecegimiz seyleri 
		// degistirme yapabilmeyi sagliyor
		// sifrede old gibi hepsini x yazdir gibi
		// genellemelerde yapilir. char ile genelleme yapilamaz
		
		//replaceAll kullanarak degistirecegim
		String str="*Java 98ogrenmek c..ok k876olay";
		System.out.println(str+"\n\n");
		// String regex , digitler degisecek
		
		str=str.replaceAll("\\d", "");
		
		// System.out.println(str);
		//   \\w wordler \\W word olmayanlar
		str=str.replaceAll("\\s", "x");
		
		// System.out.println(str);
	
		str=str.replaceAll("\\W", "");
		
		// System.out.println(str);
		
		str=str.replace("x", " ");
		System.out.println(str);
		
		// \\s bosluk karakteri
		//  \\S bosluk disindeki  tum karakterler
		// \\w
		// \\W
		// \\d 
		//  \\D
		//  \\s+ cok bosluklari
		// \\b
	}

}
