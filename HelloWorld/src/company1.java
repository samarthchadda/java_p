// constructor overloading
public class company1 {

	String domainName;
	
	public company1()
	{
		domainName = "default";
	}
	
	public company1(String domainName)
	{
		this.domainName=domainName;
	}
	
	public void getName()
	{
		System.out.println(this.domainName);
	}
	
	
	public static void main(String[] args) {
		
		company1 obj1 = new company1();
		company1 obj2 = new company1("Programiz");
		
		obj1.getName();
		obj2.getName();

	}

}
