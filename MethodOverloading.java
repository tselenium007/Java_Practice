public class MethodOverloading {
	public void OpenSheet(int sheetNo){
		System.out.println("Opened Sheet no # "+sheetNo);
	}
	
	public void OpenSheet(String sheetName){
		System.out.println("Opened Sheet "+sheetName);
	}
	
	public static void main(String[] args){
		MethodOverloading m1 = new MethodOverloading();
		m1.OpenSheet("TestSheet");
		m1.OpenSheet(1);
	}
}