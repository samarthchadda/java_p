
public class largestELementInArray {

	
	public static void main(String[] args) {
		
		double[] numbers = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
		
		double largest = numbers[0];
		
		for(double num : numbers)
		{
			if(num > largest)
				largest = num;
			
		}
		
		System.out.format("Largest Element = %.2f",largest);
				// or printf 
	}

}
