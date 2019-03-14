public class StringFunctions {
	String a = "Arvind Singh";
	String b = "ARVind Singh";
	
	public void StringLength(){
		
		System.out.println(a.length());
	}
	
	public void StartEndWithF(){

		System.out.println(a.startsWith("A"));
		System.out.println(a.endsWith("z"));
	}
	
	public void UpperLowerF(){
			System.out.println(a.toUpperCase());
			System.out.println(a.toLowerCase());
	}
	
	public void SequalsIgnorecase(){
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
		
	}
	
	public void Scontains(){
	System.out.println(a.contains("l"));
	System.out.println(a.contains("i"));
	}
	
	
	public static void main(String[] args){
		StringFunctions s = new StringFunctions();
		s.StringLength();
		s.StartEndWithF();
		s.UpperLowerF();
		s.SequalsIgnorecase();
		s.Scontains();
	}
}