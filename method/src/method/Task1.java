package method;

public class Task1 {
	
	public static void main(String[] args) {
		String name = "コラボ";
		int age = 30;
		double hight = 178.0;
		
		myProfile(name,age,hight);
	}
	static void myProfile(String name, int age, double hight) {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + hight + "cmです。");
		System.out.println("よろしくお願いします。");
	}

}
