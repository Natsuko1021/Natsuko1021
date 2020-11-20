package vrietyArray;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		
		Integer[] nums = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		
		ArrayList<Integer>kisuu = new ArrayList<>();
		ArrayList<Integer>guusuu = new ArrayList<>();
		
		for(int num:nums) {
			if(num % 2 == 0) {
				guusuu.add(num);
			}else {
				kisuu.add(num);
			}
		}
		System.out.print("奇数:");
		System.out.println(kisuu);
	    
		System.out.print("偶数:");
		System.out.println(guusuu);
		
	}
	}
