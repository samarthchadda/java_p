class animal
{
	void eat()
	{
		System.out.println("Eating....");
	}
}

class dog extends animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}

class babyDog extends dog
{
	void weep()
	{
		System.out.println("Weeping....");
	}
}

public class multilevelInheritance {

	public static void main(String[] args) {
		
		babyDog d = new babyDog();
		d.weep();
		d.bark();
		d.eat();
		
	}

}
