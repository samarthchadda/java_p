
public class thisKeyword {

	 int instVar;
	   thisKeyword(int instVar){
	        this.instVar = instVar;
	        System.out.println("this reference = " + this);
	    }

	public static void main(String[] args) {
		
		thisKeyword obj = new thisKeyword(8);
        System.out.println("object reference = " + obj);
        
	}

}

