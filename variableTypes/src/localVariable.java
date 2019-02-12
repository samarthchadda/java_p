
public class localVariable {

	public void studentAge(){
		int age = 0; //local variable
		age += 10;
		System.out.println("Student Age is: "+age);
	}
	
	public static void main(String[] args) {
		
		localVariable obj = new localVariable();
		obj.studentAge();

	}

}
