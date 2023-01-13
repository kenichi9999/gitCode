package practice_site;

public class InheritanceInterfacePractice {

	public static void main(String[] args) {
		
		Musician[] band = {
				new Vocalist("桜井"),
				new Guitarist("田原","リードギター"),
				new Guitarist("田原","ベース"),
				new ChorusDrummer("鈴木")
		};
		
		
		for (Musician item:band) {
			if(item instanceof Singable) {
				((Singable) item).sing();
			}
			
			if(item instanceof Playable) {
				((Playable) item).play();
			}
		}
	}
}

abstract class Musician{
	private String name;
	public Musician(String name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

interface Singable{
	void sing();
}

interface Playable{
	void play();
}

class Vocalist extends Musician implements Singable{

	public Vocalist(String name ){
		super(name);
	}
	
	public void sing() {
		System.out.println(getName() + "熱唱しました！");
	}
}

class Guitarist extends Musician implements Playable{
	private String guitarType;
	
	Guitarist(String name,String type){
		super(name);
		this.guitarType = type;
	}
	
	public void play() {
		System.out.println(getName()+"は"+guitarType+"を演奏しました！");
	}
}

class ChorusDrummer extends Musician implements Singable,Playable{
	ChorusDrummer(String name){
		super(name);
	}
	
	public void sing(){
		System.out.println(getName() + "はコーラスでハモりました！");
	}
	
	public void play() {
		System.out.println(getName()+"はドラムを演奏しました！");
	}	
}


