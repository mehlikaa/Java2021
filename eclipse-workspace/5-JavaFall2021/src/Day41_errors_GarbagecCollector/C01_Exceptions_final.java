package Day41_errors_GarbagecCollector;

public class C01_Exceptions_final {

	final static double pi=3.14;
	
	public static void main(String[] args) {
		
		//C01 pi sayisini static 
		
		
		
		
		// String str=' ';		bu syntax hatasi calismaz. try ile cozulmez
		String s="";
		try {
			s+="t";
			
		}catch (Exception e) {
				s+="c";
			
			}finally {
				s+="f";
		}
		System.out.println(s+="a");
		
		//==============
		//  Ali Sezgin  
		        System.out.println(exceptions());
		    }
		    public static String exceptions() {
		        String result ="";
		        String v = null ;
		        
		        try {
		            try {
		            result = result + "a" ;
		            v.length() ;
		            result = result + "b";
		            
		            } catch (NullPointerException e) {
		                result = result + "c" ;
		                
		            }finally {
		                result = result + "d" ;
		                throw new Exception() ;
		            }
		        } catch (Exception e) {
		            result = result + "e" ;
		        }
		        
		    
		        return result;
		    }
	}


}
