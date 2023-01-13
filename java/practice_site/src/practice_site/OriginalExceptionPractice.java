package practice_site;

public class OriginalExceptionPractice {

	public static void main(String[] args) {
		CarEx mycar = new CarEx(123,"ロミオ",0.8);
		
		try {
			
			while(true) {
				mycar.run();
			}
			
		}catch (GasolineException e) {
			System.out.println(e.getMessage());
		}
		

	}	
}

class GasolineException extends Exception{
	GasolineException(String gas){
		super(gas);
	}
}

class CarEx{
	private int number;
	private String type;
	private double gas;
	
	
	CarEx(int number ,String type,double gas){
		this.number = number;
		this.type = type;
		this.gas = gas;
	}
	
	public void run () throws GasolineException{
		if(gas < 0.1) {
			throw new GasolineException("ナンバー"+number +"の"+type+"はガソリン不足のため走行できません。");
		}else {
			gas = gas - 0.1;
			System.out.println("ナンバー"+number +"の"+type+"は走行しています。");
		}
	}
	
}
