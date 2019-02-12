
public class postfixPrefix {

	
	public static void main(String[] args) {
		
		int a=20,b=10,c=0,d=20,e=40;
		
		c = ++a; //a=a+1 and then c=a,  now a=21,c=21
		System.out.println("c=" + c);
		
		c=b++;  //c=b and then b=b+1,   now c=10, b=11
		System.out.println("c=" + c);
		
		c = --d;  //d=d-1 and then c=d,  now d=19,c=19
		System.out.println("c=" + c);
		
		c = --e; //e=e-1 and then c=e,  now e=39, c=39
		System.out.println("c=" + c);
		
		System.out.println("\n");
		System.out.println("\n");
		
		
		
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		System.out.println("\n");
		System.out.println("\n");
		
		
		
		int p=10,q=10;
		System.out.println(p++ + ++p); //10 + 12 =22
		System.out.println(q++ + q++); //10 + 11 =21
		
		

	}

}
