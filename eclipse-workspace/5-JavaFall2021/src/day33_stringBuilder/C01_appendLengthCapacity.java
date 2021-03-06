package day33_stringBuilder;

public class C01_appendLengthCapacity {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		System.out.print("sb.length : "+sb.length());				//0
		System.out.println("      sb.capacity : "+sb.capacity());//16
		
		
		StringBuilder sb2=new StringBuilder("Java candir");
		
		System.out.print("sb2.length : "+sb2.length());				//11
		System.out.println("      sb2.capacity : "+sb2.capacity());//27
	
		StringBuilder sb3=new StringBuilder(7);
		
		sb3.append("Mehlikaa");
		
		System.out.print("sb3 7 iken Mehlika ekledim\n"+  "sb3 length "+sb3.length());//7
		System.out.println("      sb3.capacity : "+sb3.capacity());								//7
		
		sb3.append("Emirhan bla bla");
		System.out.print("Emirha ekledim\n"+"sb3.length : "+sb3.length());	//22
		System.out.println("      sb.capacity : "+sb3.capacity());						//22
		
		StringBuilder sb4=new StringBuilder(7);
		System.out.print("\nsb4.length : "+sb4.length());
		System.out.println("     sb4.capacity : "+sb4.capacity());
		
		sb4.append("Nilgun");
		System.out.print("Nilgun ekledim"+"\nsb4.length : "+sb4.length());
		System.out.println("     sb4.capacity : "+sb4.capacity());
		
		sb4.append(" candir");
		System.out.print(" candir ekledim"+"\nsb4.length : "+sb4.length());
		System.out.println("     sb4.capacity : "+sb4.capacity());
		System.out.println("sb4 : "+ sb4);
		
		
		
		sb.append("Java ");
		System.out.print("\nsb  :   "+sb);
		
		sb.append(" candir");
		System.out.print("\nsb  :   "+sb);
		
		sb.append("anlasildi mi ",3, 4);	//3. indexten 4é kadar yazdirdi
		System.out.print("\nsb  :   "+sb);
		
		sb.append("anlasildi mi ",5, 8);	//3. indexten 4é kadar yazdirdi
		System.out.print("\nsb  :   "+sb);
	}

}
