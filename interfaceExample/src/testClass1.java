interface bank
{
	float rateOfInt();
}

class sbi implements bank
{
	public float rateOfInt()
	{
		return 9.15f;
	}
}

class pnb implements bank
{
	public float rateOfInt()
	{
		return 9.7f;
	}
}


public class testClass1 {

	public static void main(String[] args) {
		
		bank b  = new sbi();    //can be      sbi b = new sbi();
		
		System.out.println("ROI : "+b.rateOfInt());

	}

}
