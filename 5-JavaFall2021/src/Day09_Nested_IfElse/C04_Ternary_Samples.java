package Day09_Nested_IfElse;

public class C04_Ternary_Samples {

	public static void main(String[] args) {
		
		int xx=112;
		System.out.println(((xx>5) ? ("Inek") : ("Koyun"))+"\n");
		
		//
		
		System.out.println((xx<91) ? 9 : 11 +"\n");
		
		//
		
		int y = 1;
		int z =1;
		
		int a = y<10 ? y++ : z++ ;
		System.out.println(y+" , "+z+" , "+ a);

	}

}
