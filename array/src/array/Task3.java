package array;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		
		int[] nums = new int[6];
	
	    Random r = new Random();
	    
	    System.out.print("[");
	    
	    for(int i=0 ; i<nums.length ; i++) {
	       nums[i] = r.nextInt(10);
	    System.out.print(nums[i]);
		    if(i < nums.length-1) {
		    System.out.print(",");
		    }
	    }
	   System.out.println("]");  
	   
	   int Max = nums[0];
	   for(int i=0 ; i<nums.length ; i++) {
	   	 if(Max < nums[i]) {
	   	 Max = nums[i];}
	   }
	   	 
	   	int Min = nums[0];
	   	for(int i=0 ; i<nums.length ; i++) {
	   	 if(Min > nums[i]) {
	   	 Min = nums[i];}
	   	}
	   System.out.println("最大値:"+ Max);
	   System.out.print("最小値:"+ Min);
	  
	   
	   
	   
	   
	   
	   
	}

	
}
