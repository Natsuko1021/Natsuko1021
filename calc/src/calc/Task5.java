package calc;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		String a = "ノートPCの値段:";
		int b = 89800;
		char c ='円';
		
		System.out.println( a + b + c );
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
		sc.close();
		
	}

}
