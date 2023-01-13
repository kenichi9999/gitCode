package practice_site;

public class AbstractBasicPractice {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0]= new Dog();
		animals[1]= new Cat();
		animals[2]= new Bird();
		
		for(Animal item : animals) {
			item.sing();
		}
		
	}

}

abstract class Animal{
	public abstract void sing();
}


class Dog extends Animal{
	public void sing() {
		System.out.println("わんわん");
	}
}

class Cat extends Animal{
	public void sing() {
		System.out.println("にゃんにゃん");
	}
}

class Bird extends Animal{
	public void sing() {
		System.out.println("ぴよぴよ");
	}
}
