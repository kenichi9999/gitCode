package practice_site;

import java.util.Random;

public class ExceptionInheritancePractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Subordinate sub = new Subordinate("有吉");
		Boss boss = new Boss("上島",sub);
		
		
		boss.work("得意先との取引");
	}

}

class TroubleException extends Exception{
}

abstract class Employee2{
	protected String name;
	public abstract void work(String workName) throws TroubleException;
}

class Boss extends Employee2{
	
	private Subordinate sub;
	
	Boss(String name , Subordinate sub){
		super.name = name;
		this.sub = sub;
	}
	
	public void work(String work) {
		System.out.println("さて今回の"+work +"は部下の"+sub.name+"に任せよう！");
		try {
			sub.work(work);
			System.out.println(sub.name + "君、よくやった！");
			System.out.println("さすが私の右腕た！");
			
		}catch(TroubleException e) {
			System.out.println("申し訳ございません。");
			System.out.println(sub.name+"が大変失礼いたしました。");
			System.out.println("上司のわたくし"+this.name+"の監督不行届きでございます。");
		}
	}
}

class Subordinate extends Employee2{
	Subordinate(String name){
		super.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void work(String work) throws TroubleException {
		System.out.println("今回の"+work+"はわたくし"+name+"が担当いたします。");
		System.out.println(work+"中・・・");
		Random rd = new Random();
		if(rd.nextBoolean()) {
			System.out.println("ふざけるな、馬鹿野郎");
			throw new TroubleException();
		}else {
			System.out.println("今回の"+work + "はわたくし"+name + "が無事任務を果たしました。");
		}
	}
	
}
