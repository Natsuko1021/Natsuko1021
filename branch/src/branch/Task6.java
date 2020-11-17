package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("1～4の数字を入力してください");
		int a = sc.nextInt();
		String b;
		sc.close();
 
        switch (a) {
            case 1:
                b = "Ⅰ";
                break;
            case 2:
                b = "Ⅱ";
                break;
            case 3:
            	b = "Ⅲ";
                break;
            case 4:
            	b = "Ⅳ";
                break;
            case 5:
            	b = "Ⅴ";
                break;
            default:
                b = "unknown";
                break;
        }
        System.out.println(a + "->" + b);
		    
		}
		
	}


