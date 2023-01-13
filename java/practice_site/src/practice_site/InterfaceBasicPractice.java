package practice_site;

public class InterfaceBasicPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Bird2[] birds = {
				new Swallow(),
				new Penguin(),
				new Atthis()
		};
		
		for (Bird2 item : birds) {
			item.eat();
			if(item instanceof Flyable) {
				((Flyable)item).fly();
				
			}
			
			if(item instanceof Swimable) {
				((Swimable)item).swim();
			}
		}
	}

}

interface Flyable{
	void fly();
}

interface Swimable{
	void swim();
}

interface Eatable{
	void eat();
}

abstract class Bird2 implements Eatable{}

class Swallow extends Bird2 implements Flyable{
	public void eat() {
		System.out.println("つばめが虫を食べました。");
	}
	
	public void fly() {
		System.out.println("つばめがスイスイ飛んでいます。");
	}
}

class Penguin extends Bird2 implements Swimable{
	public void eat() {
		System.out.println("ペンギンが魚を食べました。");
	}
	
	public void swim() {
		System.out.println("ペンギンがスイスイ泳いでいます。");
	}
}


class Atthis extends Bird2 implements Swimable,Flyable{
	public void eat() {
		System.out.println("カワセミが小魚を食べました。");
	}
	
	public void swim() {
		System.out.println("カワセミがスイスイ泳いでいます。");
	}

	public void fly() {
		System.out.println("カワセミがスイスイ飛んでいます。");
	}
}