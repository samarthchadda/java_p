//parent class
class teacher
{
	String designation = "Teacher";
	static String clgnm = "IIT";
	
	void does()
	{
		System.out.println("Teaching");
	}
	
}

//child class
public class phyTeacher extends teacher{        
	
	String mainSub = "Physics";
	
public static void main(String[] args)
{	
	
	phyTeacher obj = new phyTeacher();
	System.out.println(obj.clgnm);
	System.out.println(obj.designation);
	System.out.println(obj.mainSub);
	
	obj.does();
		
	
}

}