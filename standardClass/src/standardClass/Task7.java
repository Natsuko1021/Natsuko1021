package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Task7 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.print("現在の日時:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_MONTH,7);
		System.out.print("1週間後:");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yyyy年MM月dd日(E)");
		cal.set(Calendar.YEAR,2022);
		System.out.print("1年間後:");
		System.out.println(sdf.format(cal.getTime()));
		
	}

}
