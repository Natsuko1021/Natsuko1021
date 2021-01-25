package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Task6 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yyyy年MM月dd日HH時mm分");
		System.out.println(sdf.format(cal.getTime()));
	}

}
