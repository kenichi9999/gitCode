package practice_site;

public class AbstractCastPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Athlete[] athlete = {
				new Swimmer("北島光一"),
				new MarathonRunner("高橋昭子"),
				new Swimmer("岩崎正子"),
				new MarathonRunner("野口みきえ")
				
		};
		
		for(Athlete item : athlete) {
			System.out.println(item);
		}
			
		System.out.println();
		
		for(Athlete item : athlete) {
			if(item instanceof Swimmer) {
				((Swimmer) item).swim();
			}if(item instanceof MarathonRunner) {
				((MarathonRunner)item).run();
			}
	/*		
			if(item.getType().equals(Swimmer.TYPE)) {
				Swimmer sw = (Swimmer)item;
				sw.swim();
			}else {
				MarathonRunner ma = (MarathonRunner)item;
				ma.run();
			}
		*/	
		}
	}
}

abstract class Athlete{
	protected String name;
	public abstract String getType();
	
	@Override
	public String toString() {
		return "私の名前は" + name  + "、"+ getType()+"の選手です。";
	}
}

class Swimmer extends Athlete{
	public static final String TYPE = "水泳";
	
	Swimmer(String name){
		super.name = name;
	}
	
	public String getType(){
		return TYPE;
	}
	
	public void swim() {
		System.out.println(name+"は泳ぎました。");
	}
}

class MarathonRunner extends Athlete{
	public static final String TYPE = "マラソン";
	MarathonRunner(String name ){
		super.name = name;
	}
	
	public String getType() {
		return TYPE;
	}
	
	public void run(){
		System.out.println(name+"は走りました。");
	}
}

