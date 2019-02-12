
public class unaryOperators {

	
	public static void main(String[] args) {
		
		double num=5.2;
		boolean flag=false;
		
		System.out.println("+number = "+ +num);
		
		System.out.println("-number = "+ -num);

		//++num is equivalent to num=num+1,   now,  num= 5.2+1 = 6.2
		System.out.println("++number = "+ ++num);
		
		//--num is equivalent to num=num-1,    now,  num = 6.2-1=5.2
		System.out.println("--number = "+  --num);
		
		//boolean
		System.out.println("flag = "+ flag);
		System.out.println("!flag = "+ !flag);
		//flag is still false
		
		int myInt=5;
		++myInt;     //6
		myInt++;     //7
		--myInt;   //6
		myInt--;   //5
		System.out.println(myInt);
		
		
		
		
	}

}
