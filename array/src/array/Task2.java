package array;

public class Task2 {

	public static void main(String[] args) {
		
	int[] numbers = {7,6,5,4,3,2,1};
	for(int i=0; i<numbers.length; i++) {
        System.out.print(numbers[i]);
        if(i < numbers.length -1 ) {
    		System.out.print(",");
    		}
    }
	System.out.println(" ");
	for(int i=numbers.length-1; i>=0; i--) {
         System.out.print(numbers[i]);
         if(i >= numbers[6] ) {
     		System.out.print(",");
     		}
     }
	}

}
