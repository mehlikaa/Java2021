package day32_immutable;

public class C01_immutable {

	public static void main(String[] args) {
		
		String s="Hello";
		
		String t=new String(s);
		if ("Hello".equals(s)) 		System.out.println("One          \"Hello\".equals(s)");
		
		if(t==s) System.out.println("Two         t== s");
		
		if (t.equals(s)) 		System.out.println("Three        t.equals s");
		
		if("Hello"==s) 	System.out.println("Four         \"Hell\"==s ");
		
		if("Hello"==t) 	System.out.println("Five        \"Hell\"==t ");
		
		
		
	}

}
