
public class finalEx {

	final int speed = 90; //final variable	
	
	void run()
	{
		speed=400;
	}
	
	public static void main(String[] args) {
		
		finalEx obj = new finalEx();
		obj.run();
		
		
	}

}
