package branch;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
	    int num1 = sc.nextInt();
		System.out.println(num1);
		sc.close();
		
		if(num1 > 0) {System.out.println("入力された数字は正の数です。");
		}else if(num1 < 0) {System.out.println("入力された数字は負の数です。");
	    }else{System.out.println("入力された数字は0です。");
	    }
	}

}
