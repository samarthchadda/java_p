import java.util.Scanner;
public class switchStatement {

	
	public static void main(String[] args) {
		
		System.out.println("Enter day number: ");
		Scanner sc= new Scanner(System.in);
		
		int daynum=sc.nextInt();
		String day;
		
		switch(daynum)
		{
		case 1:
			day="Sunday";
			break;
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;
		default:
			day="Invalid day number";
			
		}
		System.out.println(day);
		
	}

}
