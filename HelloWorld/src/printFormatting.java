
public class printFormatting {

	
	public static void main(String[] args) {
		
		System.out.printf("%d",10);   //integer
		System.out.println();
		System.out.printf("%f",10.1);     //float
		System.out.println();	
		System.out.printf("%c",'a');     //character
		System.out.println();
		System.out.printf("%C",'a');     //here, it is looking for uppercase character
		System.out.println();
		System.out.printf("%s","hello");  //string
		System.out.println();
		System.out.printf("%S","hello");   //uppercase string
		System.out.println();
		System.out.printf("%b",5<4);     //boolean
		System.out.println();
		System.out.printf("%B",5<4);      //boolean(in capital)
		System.out.println();
		System.out.printf("%b",null);
		System.out.println();
		
		System.out.printf("%b","cow");     //since , condition cannot be evaluated, so 'true' will be printed by printf
		System.out.println();
		
		
		System.out.printf("%n");     //line break or newline
		System.out.printf("\n");    //same as above
		System.out.printf("%%");     //printing %
		
		
		
		
		
		
		

	}

}
