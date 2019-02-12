
public class dataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean
		boolean flag=true;
		System.out.println(flag);
		
//		byte
		byte range=124;
		System.out.println(range);
		
//		short
		short temp=-200;
		System.out.println(temp);
		
//      int
		int i = -4250000;
		System.out.println(i);
		
//     long
		long l = -42332200000L;    //error, if L is not present(if L is absent, it 
									// is considered as int )
		System.out.println(l);
		long var = 23;
		System.out.println(var);

//		double
		double number = -42874946747303838.3;
		System.out.println(number);
		
//		float
		float num = -42.3f;   // error, if f is not present(if f is absent, num is 
							// considered as double even though dataType is specified)
		System.out.println(num);
		
//		char
		char letter = '\u0051';
    	System.out.println(letter);
    	
    	char letter1 = '9';
    	System.out.println(letter1);
    	
    	char letter2 = 65;
    	System.out.println(letter2);
    	
    	char letter3='a';
    	System.out.println(letter3);
    	
//    	string
    	String s1="java";
    	System.out.println(s1);
		
    	char ch[]={'s','t','r','i','n','g','s'};  
    	System.out.println(ch);
    	
    	s1="samarth";         //s1 is now pointing to another sequence , but "java" sequence
    						  // is not changed , hence string is immutable
    							
    	System.out.println(s1);
		
	
		
		
	}
}
