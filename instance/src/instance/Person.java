package instance;

public class Person {

 String name = "";
 int age = 0;
}
	
class sample1
{
	 public static void main(String[] args)
	 {
		 Person person1;
		 person1 = new Person();
		 
		 person1.name = "木内菜津子";
		 person1.age = 19;
		 
		 System.out.println("私の名前は" + person1.name +"です。");
		 System.out.println("年齢は" + person1.age + "です。");
		 System.out.println("よろしくお願いします。");
		 
		 
	 }
}

