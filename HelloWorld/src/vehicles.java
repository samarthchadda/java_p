
public class vehicles {

		int wheels;
		private vehicles(int wheelCons){
			wheels=wheelCons;
			System.out.println(wheels+ " wheeler vehicle created");
			
		}
	
	
	public static void main(String[] args) {
		
		vehicles v1= new vehicles(2);
		vehicles v2= new vehicles(4);
		
	}

}
