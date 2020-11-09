package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("数字を入力してください:");
		
	    int n = sc.nextInt();
	    int a = 0;
	    
	    while(n > 0 ) {
	    n /= 10;
	    a ++;
	}
	    System.out.print("桁数:" + a );
	    sc.close();
}
}