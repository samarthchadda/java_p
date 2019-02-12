
public class sumOfNaturalNumbersWhileLoop {

	
	public static void main(String[] args) {
		
		//program to find sum of natural numbers from 1 to 100
		int sum=0, i=100;
		
		while(i != 0)
		{
			sum += i;
			i--;    //or here --i
				
		}
		System.out.println("Sum ="+sum);
		
	}

}
