package Constructors;

public class C05_Student {

	String name="Emily";
	int age =20;
	
	C05_Student(String name, int age) {
		this.name=name;
		this.age=25;      // sabit atama
		
	}
	
	
	public static void main(String[] args) {
		
		C05_Student st=new C05_Student("Oliver", 21);
		
		System.out.print(st.name);
		
		System.out.print(", "+ st.age);

	}

}
