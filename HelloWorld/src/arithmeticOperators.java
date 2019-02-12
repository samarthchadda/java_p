
public class arithmeticOperators {

	public static void main(String[] args) {
		
		double num1=12.5, num2=3.5, res;
		
//		addition operator
		res=num1+num2;
		System.out.println("Number1 + Number2 = " + res);
		
//		subtraction operator
		res=num1-num2;
		System.out.println("Result = " + res);
		
//		multiplication operator
		res=num1*num2;
		System.out.println("Result = " + res);
		
//		division operator
		res=num1/num2;
		System.out.println("Result = " + res);
		
//		remainder operator
		res=num1%num2;
		System.out.println("Result = " + res);
		
//		+ operator can also be used to concatenate two or more strings
		String start,mid,end,result;
		start="My name is ";
		mid="Samarth Chadda ,and ";
		end="My age is 20";
		
		result=start+mid+end;
		System.out.println(result);
		

	}

}
