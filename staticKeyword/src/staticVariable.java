
class student 
{
	int rno;
	String nm;
	static String college = "ITS";    //static variable
	
	
	student(int r, String n)
	{
		rno=r;
		nm = n;
	}
	
	
	void display()
	{
		System.out.println(rno+" "+nm+" "+college);
	}
		
}


public class staticVariable {

	
	public static void main(String[] args) {
		
		student s1 = new student(1,"abc");
		student s2 = new student(2,"def");
		
		 //we can change the college of all objects by the single line of code  
		 //student.college="BBDIT";  
		
		s1.display();
		s2.display();
		
		
		

	}

}
