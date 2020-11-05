package branch;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println("数字を入力してください");
		
		
		Scanner sc = new Scanner(System.in);		
	    int num1 = sc.nextInt();
		System.out.println(num1);
		sc.close();
		
		if(num1 < 10)
		System.out.println("値:" + 0 + num1);
		
		if(num1 >=10)
		System.out.println("値:"+ num1);
		
				

	}

}
