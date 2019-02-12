
public class stringCreation {

	public static void main(String[] args) {
		
		String s1="Java"; //creating string by java string literal
		String s2=new String("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);
		
		
		String str1="Hello";
		String str2=new String(str1);
		System.out.println(str2);
		
		String str3=str1 + s1;
		System.out.println(str3);
		
		String str4="Hello" + "World";
		System.out.println(str4);
		
		char ch[]={'s','t','r','i','n','g'};
		String s3=new String(ch);  //converting char array to string
		System.out.println(s3);
		
		
		
		

	}

}
