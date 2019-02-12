class marks
{
	
	//instance variables
	int chem;
	int phy;
	
}


public class marksDemo {

		
	public static void main(String[] args) {
		
		//first object
		marks obj1 = new marks();
		obj1.chem = 50;
		obj1.phy = 70;
		
		//second object
		marks obj2 = new marks();
		obj2.chem = 98;
		obj2.phy = 95;
		
		
		System.out.println("Marks for First object:-");
		System.out.println(obj1.chem);
		System.out.println(obj1.phy);
		
		System.out.println("Marks for Second object:-");
		System.out.println(obj2.chem);
		System.out.println(obj2.phy);
		
		
	}

}
