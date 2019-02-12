import java.util.Scanner;
public class calculatorUsingSwitch {
	public static void main(String[] args) {
		
		char operator;
		double num1,num2,res=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter operator (either +, -, * or /): ");
		
		//grabbing the character
		operator= sc.next().charAt(0);
		
		System.out.println("Enter two numbers: ");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		
		switch(operator)
		{
		
		case '+':
			res=num1 + num2;
			break;			
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
		
		default:
			System.out.println("Invalid operator");	
			
			
		}
		System.out.println("Result = "+res);
	}

}
