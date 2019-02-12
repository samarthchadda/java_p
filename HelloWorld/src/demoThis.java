class thisExample{
	int x;
	int y;
	
	thisExample(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Before passing this to addTwo() method");
		System.out.println("x= "+this.x+" , y= "+this.y);
		
		addTwo(this);
		
		System.out.println("After passing this to addTwo() method");
		System.out.println("x= "+this.x+" , y= "+this.y);
		
	}
	
	void addTwo(thisExample o)
	{
		o.x += 2;
		o.y += 2;
		
	}

}	


public class demoThis {

	
	public static void main(String[] args) {
		
		thisExample obj = new thisExample(1,-2);
		
	}

}
