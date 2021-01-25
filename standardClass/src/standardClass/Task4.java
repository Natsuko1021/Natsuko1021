package standardClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task4 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 ="ABCDGOPQRSYZ";
		System.out.print("探したい文字:");
		String str2 = br.readLine();
		
		if(str1.contains(str2)) {
			System.out.println(str1 + "は" + str2 +"を含む");
			
		}else {
			System.out.println(str1 + "は" + str2 +"を含まない");
		}
	}

}
