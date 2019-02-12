
class Bike{
	
	final void run()
	{
		System.out.println("running");
	}
	
}

 class finalEx1 extends Bike {
	 void run()      //overriding the function
	 {
		 System.out.println("running safely");
	 }
	
	 
	public static void main(String[] args) {
	
		finalEx obj = new finalEx();
		obj.run();

	}

}
