
public class precision1 {

	
	public static void main(String[] args) {
		
		String str="hello";
		int num=15;
		char let='A';
		
		System.out.printf("%.2s%n",str);    //first 2 letters
		System.out.printf("%.3b%n",true);
		
		System.out.printf("%.3d%n",num);   //we cannot specify precision with integers
		
		System.out.printf("%.2c%n",let);    //error
		
		System.out.printf("%.3n",num);		//error
		

	}

}
