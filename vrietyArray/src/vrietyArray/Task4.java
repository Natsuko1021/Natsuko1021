package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class Task4 {

	public static void main(String[] args) {
		
		Integer[] nums = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};
		
		ArrayList<Integer>kisuu = new ArrayList<>();
		ArrayList<Integer>guusuu = new ArrayList<>();
		
		for(int num:nums) {
			if(num % 2 == 0) {
				guusuu.add(num);
			}else {
				kisuu.add(num);
			}
		}
		HashMap<String, ArrayList<Integer>> name = new HashMap<>();
		name.put("偶数",guusuu);
		name.put("奇数",kisuu);
		
		System.out.println(name.entrySet());
				
		
			}
		

	}


