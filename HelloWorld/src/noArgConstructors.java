
class company
{
	String domainName;
	
	//object is created in another class
	public company()
	{
		domainName="programiz.com";
		System.out.println("Constructor called");
	}
	
	
}


public class noArgConstructors {

	
	public static void main(String[] args) {

		company obj =new company();
		System.out.println("Domain name = "+obj.domainName);
		

	}

}
