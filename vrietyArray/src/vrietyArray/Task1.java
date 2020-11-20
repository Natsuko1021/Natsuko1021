package vrietyArray;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
	ArrayList<String>areaName = new ArrayList<>();
	areaName.add("・北海道");
	areaName.add("・東北");
	areaName.add("・関東");
	areaName.add("・中部");
	areaName.add("・近畿");
	areaName.add("・中国");
	areaName.add("・四国");
	areaName.add("・九州");
	
	for(String name:areaName) {
		System.out.println(name);
	}
 }
}
