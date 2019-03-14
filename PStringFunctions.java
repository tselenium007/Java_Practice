public class PStringFunctions {
	static String a = "abcd";
	static String b = "xyz";
	static String c = "abcd xyz klmn 1234 4567";
	
	public void vLength(){
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		if((a.length() > b.length()) && (a.length() < c.length()))
			System.out.println(name +" passed.");
		else
			System.out.println(name +" failed.");
	} 
	
	
	public static void main(String[] args){
		PStringFunctions p = new PStringFunctions();
		p.vLength();
	}
}