package Day28_exceptions;

public class EC01_exceptions {

	public static void main(String[] args) {
		
		// my first eng JAva class, and I don't understand anything
		
		Object obj=5;
		convert(obj);
		
		String s1="1234";
		convertStringToInteger(s1);
		
		String s2="1a2bc34";
		convertStringToInteger(s2);
		
	}
	// create a method to convert an Object class object to String
	public static void convert(Object obj) {
		try {
		String convertedString =(String)obj;
				//this is the method we are creating object now
		System.out.println(convertedString);
				//ClassCastException : If a data type can't be converted to another data type.
				//then Java throws this exception
		} catch (ClassCastException e) {
			System.out.println("Some data type can't be converted to some other data type."+e.getMessage());
		}
		
	}
	//create a method to convert String variable to Integer variable
	public static void convertStringToInteger(String str) {
		int convertedInteger =Integer.parseInt(str); 
		//parseInt() converts Strings to Integer.
		// If a string can be converted to integer , we call it parsable
		System.out.println(convertedInteger);
		
		} //catch (NumberFormatException e) { 
			//System.out.println("String having some non-digit ");
		//}
		
	
	}

