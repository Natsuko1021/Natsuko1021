package standardClass;

public class Task5 {

	public static void main(String[] args) {
		
		String text = "cat_mouse_mouse_cat_cat";
		String[] item = {"cat", "mouse"};
		int count[] = new int[item.length];

		for (int i = 0; i < item.length; i++) {
		count[i] = wordCount(text, item[i]);
		}
		for (int n : count) {
			System.out.print(n + " "); //catは3回、mouseは2回
			
			}
		System.out.print("catの方が多い");
		}
	
	
	
	private static int wordCount(String text, String keyword) {
		String temp = text.replaceAll(keyword, "");
		return (text.length() - temp.length()) / keyword.length();
		
	    }
	}
	 


