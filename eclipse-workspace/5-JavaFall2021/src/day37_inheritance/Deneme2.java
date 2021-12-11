package day37_inheritance;


	public class Deneme2 extends Class2 {
	    
	    int num1=20;
	    int num3=21;
	    String name2="Hakan San";
	    String name3="Kemal";
	    
	    Deneme(){
	        System.out.println("Child constructor calisti");
	        
	        System.out.println(this.num1);
	        System.out.println(super.num1);
	        System.out.println(this.num2);
	        System.out.println(super.num2);
	        System.out.println(this.num3);
	        //System.out.println(super.num2);
	        
	        super.name1="Hatice Sen";
	        System.out.println(this.name1);
	        System.out.println(super.name1);
	        this.name1="Kadir Naz";
	        System.out.println(this.name2);
	        System.out.println(super.name2);
	        System.out.println(this.name3);
	        //System.out.println(super.name3);
	        
	    }
	    
	    
	    public static void main(String[] args) {
	        Deneme deneme=new Deneme();
	    }
	}