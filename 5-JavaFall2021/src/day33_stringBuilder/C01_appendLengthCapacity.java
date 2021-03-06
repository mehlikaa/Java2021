package day33_stringBuilder;

public class C01_appendLengthCapacity {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		System.out.print("sb.length : "+sb.length());
		System.out.println("      sb.length : "+sb.capacity());
		
		sb.append("Cihan");
		System.out.print("Cihan ekledim\n"+"sb.length : "+sb.length());
		System.out.println("      sb.length : "+sb.capacity());
		
		sb.append("\nEmirhan bl bal bla bla bla bla");
		System.out.print("Emirha ekledim\n"+"sb.length : "+sb.length());
		System.out.println("      sb.length : "+sb.capacity());
		
		StringBuilder sb4=new StringBuilder(7);
		System.out.print("\nsb4.length : "+sb4.length());
		System.out.println("     sb4.length : "+sb4.capacity());
		
		sb4.append("Nilgun");
		System.out.print("Nilgun ekledim"+"\nsb4.length : "+sb4.length());
		System.out.println("     sb4.length : "+sb4.capacity());
		
		
		sb4.append("Belgune", 2,5);
		System.out.print("Nilgun Belgunun 2'den 5 ekledim  "+sb4);
		
	}

}
