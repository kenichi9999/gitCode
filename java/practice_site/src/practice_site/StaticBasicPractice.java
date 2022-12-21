package practice_site;

public class StaticBasicPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ロボット総生産数：" + Robot.getTotal());		
		
		Robot[] robots = {
				new Robot("RX"),
				new Robot("PZ"),
				new Robot("SS"),
				new Robot("FG"),
				new Robot("VC"),
				null
		};
		
		System.out.println("ロボット総生産数：" + Robot.getTotal());		
		
		robots[5] = new Robot("SUPER-Z");
		
		System.out.println("ロボット総生産数：" + Robot.getTotal());		
		for(Robot item: robots ) {
			item.intoroduce();
		}
	}

}

class Robot{
	private int id;
	private String name;
	private static int total;
	Robot(String name){
		this.name = name;
		total++;
		this.id = total;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public void intoroduce() {
		System.out.println("ID:"+id+" NAME:"+name);
	}
	
	
}