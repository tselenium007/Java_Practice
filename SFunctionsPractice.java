public class SFunctionsPractice {
	static String a = "abcdef";
	static String b = "xyz1234";
	static String c = "abcxy";
	
	public static void main(String[] args){
		//Condition 1
		if((a.length() > c.length()) && (a.length() < b.length()))
			System.out.println("A is greater than C and less than B");
		else
			System.out.println("Verification failed");
		
		//Condition 2
		if(a.equals(b) == false && a.equals(c) == false)
			System.out.println("True");
		else
			System.out.println("False");
		
		//Condition 3
		if(c.equalsIgnoreCase(a))
			System.out.println("True");
		else
			System.out.println("False");
		
		//Condition 4
		if(a.contains("cd") == true && a.contains("xy") == false)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		
		//condition 5
		// a method without arguments should always be called with braces
		if((b.toUpperCase().contains("Z") == true) && (b.toUpperCase().contains("z") == false))
			System.out.println("Condition true");
		else
			System.out.println("Condition false");
	}
	
}