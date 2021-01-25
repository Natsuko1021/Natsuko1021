package standardClass;

public class Task3 {

	public static void main(String[] args) {
		
		String a = "文字列:ABCDEFG";
		String c = "";
		
		for(int b = a.length();b>0;--b) {
		c=c+a.charAt(b-1);
		}
		System.out.println(a);
		System.out.println(c);
	}

}
