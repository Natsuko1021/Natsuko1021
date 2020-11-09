package loop;

import java.util.Scanner;

public class Task1 {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("数字を入力してください:");
		
	    int n = sc.nextInt();
	    int sum = 0;
	    for(int i = 0; i <= n; i++) {
	    	sum += i;    	
	    }
	    System.out.println("1～" + n + "までの合計:"+  sum);
	    sc.close();

	}

}
