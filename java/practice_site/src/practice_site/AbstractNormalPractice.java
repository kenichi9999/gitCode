package practice_site;

public class AbstractNormalPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		SoccerPlayer fwd = new CenterForward("田村",11);
		System.out.println(fwd);
		
		fwd.kickBall();
		fwd.catchBall();
		
		SoccerPlayer keeper = new GoalKeeper("川島",12);
		System.out.println(keeper);
		keeper.kickBall();
		keeper.catchBall();
	}

}

abstract class SoccerPlayer{
	private String name;
	private int uniformNumber;
	
	SoccerPlayer(String name , int uniformNumber){
		this.name = name;
		this.uniformNumber = uniformNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void kickBall() {
		System.out.println(name+"はボールを蹴りました。");
	}
	public void catchBall() {
		System.out.println(name+"はボールを足で受け止めました。");
	}
	
	abstract public String getPositionName();
	
	@Override
	public String toString() {
		return getPositionName() + " " + name + " 背番号 "  + uniformNumber; 
	}
}

class CenterForward extends SoccerPlayer{
	private String POSITION_NAME = "センターフォワード";
	
	CenterForward(String name,int uniformNumber){
		super(name,uniformNumber);
	}
	
	public String getPositionName() {
			return POSITION_NAME;				
	}
}

class GoalKeeper extends SoccerPlayer{
   private String POSITION_NAME = "ゴールキーパー";
	
	GoalKeeper(String name,int uniformNumber){
		super(name,uniformNumber);
	}
	public String getPositionName() {
		return POSITION_NAME;				
    }
	
	@Override
	public void catchBall() {
		System.out.println(getName() + "はボールを手で受け止めました。");
	}
}
