
public class precision {

	
	public static void main(String[] args) {
		
		double num = 10.1234;
		
		System.out.printf("%f%n",num); //no precision specified
		//When no precision is given , then %f by default will give 6 decimal places.
		//For conversion types %f, %e, %E, %g, %G, the default precision is 6
		
		//adding precision
		
		double num1=12.3456789;
		//no decimal place
		System.out.printf("%.0f%n",num1);
		
		//one decimal place
		System.out.printf("%.1f%n",num1);
		
		System.out.printf("%.2f%n",num1);        //rounding off will also be done
		
		System.out.printf("%.3f%n",num1);
		
		System.out.printf("%.4f%n",num1);
		
		System.out.printf("%.5f%n",num1);
		
		System.out.printf("%.6f%n",num1);
		
		System.out.printf("%.7f%n",num1);
		
		System.out.printf("%.8f%n",num1);
		
		
		

	}

}
