package practice_site;

public class InheritanceBasicPractice {

	public static void main(String[] args) {
		Pitcher p = new Pitcher("山田",99,0.09,2.13);
		p.intoroduce();

	}

}

class BaseballPlayer{
	protected String name;
	protected int uniformNumber;
	protected double battingAverage;
}

class Pitcher extends BaseballPlayer{
	protected double era;
	
	Pitcher(String name , int uniformNumber,double battingAverage,double era){
		this.name = name;
		this.uniformNumber = uniformNumber;
		this.battingAverage = battingAverage;
		this.era = era;
	}
	
	public void intoroduce() {
		System.out.println("選手名："+name);
		System.out.println("背番号："+uniformNumber);
		System.out.println("打率："+battingAverage);
		System.out.println("防御率："+era);
	}
}