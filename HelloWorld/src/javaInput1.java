import java.util.Scanner;
public class javaInput1 {

	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		//getting float input
		System.out.print("Enter Float: ");
		float f=input.nextFloat();
		System.out.println("Float Entered: "+f);
		
		//getting double input
		System.out.print("Enter Double: ");
		double d=input.nextDouble();
		System.out.println("Double Entered: "+d);
		
		//getting string input
		System.out.print("Enter Text: ");
		String s=input.next();    //This can take only the first String in the line
		System.out.println("Text Entered: "+s);
		
		//getting whole string line
		System.out.print("Enter Line: ");
		String nm = input.next();
		nm += input.nextLine();
//		String nm = input.nextLine(); 
		System.out.println("Line Entered: "+nm);
		
	}

}
