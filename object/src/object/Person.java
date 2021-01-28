package object;

public class Person {

String name;
int age;
static int wallet;

Person(int wlt){
wallet += wlt;
}

public void myProfile(){
System.out.println("私の名前は" + this.name + "です。");
System.out.println("私の年齢は" + this.age + "です。");
System.out.println("よろしくお願いします。");
}

}


