package animal;


public class Dog extends Animal{
	
	double weight;
	public Dog(String name,int age,double weight){
	super(name, age);
	this.weight = weight;
	}
	public void run() {
	System.out.println(name+"は走った");
	}
	@Override
	public void sleep() {
	System.out.print(name+"は");
	super.sleep();
	}
	public void superSleep() {
	super.sleep();
	}
	public void name() {
	System.out.println("名前："+name);
	}
	public void age() {
	System.out.println("年齢："+age+"歳");
	}
	public void weight() {
	System.out.println("体重："+weight+"㎏");
	}

}


