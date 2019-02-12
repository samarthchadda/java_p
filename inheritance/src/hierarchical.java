class animal1
{
	void eat()
	{
		System.out.println("Eating....");
	}
}

class dog1 extends animal1
{
	void bark()
	{
		System.out.println("Barking....");
	}
}

class cat extends animal1
{
	void meow()
	{
		System.out.println("Meowing....");
	}
}

public class hierarchical {

	public static void main(String[] args) {
		
		cat c = new cat();
		c.meow();
		c.eat();
		//c.bark();    //C.T. Error

	}

}
