package method;

public class Task3 {
	
	
	public static String add(String a, String b) {
		 return a + b;
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println(add("リンゴ","飴"));
		System.out.println(add(10, 8));
		System.out.println(add(12.8,10.2));
		

	}

}
