package practice_site;

public class OverloadBasicPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Chef chef = new Chef();
		
		Egg egg = new Egg();
		Rice rice = new Rice();
		Milk milk = new Milk();
		Cheese cheese = new Cheese();
		
		System.out.println("1品目は " + chef.cook(egg, cheese) + "です。");
		System.out.println("2品目は " + chef.cook(rice, egg) + "です。");
		System.out.println("3品目は " + chef.cook(rice, cheese) + "です。");
		System.out.println("4品目は " + chef.cook(milk, egg) + "です。");
		
	}

}

class Milk{}
class Egg{}
class Rice{}
class Cheese{}

class Chef{
	
	public String cook(Egg egg ,Cheese cheese){
		return "スクランブルエッグ";
	}
	public String cook(Rice rice ,Egg egg){
		return "オムライス";
	}
	public String cook(Rice rice ,Cheese cheese){
		return "リゾット";
	}
	public String cook(Milk milk , Egg egg){
		return "プディング";
	}
}
