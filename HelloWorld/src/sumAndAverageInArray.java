
public class sumAndAverageInArray {

	
	public static void main(String[] args) {
		
		int[] numbers={2,-9,0,5,12,8};
		int sum=0;
		double avg;
		
		for(int num:numbers)
		{
			sum += num;
			
		}
		
		int arrayLen=numbers.length;
		
		//changing sum and arrayLen to double as average is in double
		avg= ((double)sum / (double)arrayLen);
		
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+avg);
		

	}

}
