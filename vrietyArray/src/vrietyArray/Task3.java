package vrietyArray;

import java.util.HashMap;

public class Task3 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> fruits = new HashMap<>();
		fruits.put("りんご",130);
		fruits.put("メロン",6000);
		fruits.put("みかん",120);
		fruits.put("バナナ",98);
		
		System.out.println("りんご:" + fruits.get("りんご") + "円");
		System.out.println("メロン:" +fruits.get("メロン") + "円");
		System.out.println("みかん:" +fruits.get("みかん") + "円");
		System.out.println("バナナ:" +fruits.get("バナナ") + "円");
		
	}

}
