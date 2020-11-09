package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("正の整数を入力してください:");
		
	    int n = sc.nextInt();
	    
	    System.out.print(n + "の約数:1");
	    for(int i  = 2; i <= n; i++) {
	     if(n % i == 0) {
	     System.out.print("," + i);
	     sc.close();
	     }
	    }
	}

}
