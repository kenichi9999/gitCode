package practice_site;

public class ConstructorOverloadPractice {

	public static void main(String[] args) {
		Car car1 = new Car("トント",1234,10.0);
		Car car2 = new Car("ファット",6789);
		
		car1.run(7.0);
		car2.run(7.0);
		
		car1.showInfo();
		car2.showInfo();
	}

}


class Car{
	
	private String type;
	private int number;
	private double gasoline;
	
	Car(String type,int number,double gasoline){
		
		this.type = type;
		this.number = number;
		this.gasoline = gasoline;
	}
	
	
	Car(String type,int number){
		this(type,number,5.0);
	}
/*
	Car(String type,int number){
		this.type = type;
		this.number = number;
		this.gasoline = 5.0;
	}
*/
	public void run (double usedGasoline) {
		
		String message = "ナンバー"+number + "の" +type + "はガソリン";
		
		if(this.gasoline > usedGasoline) {
			System.out.println(message + usedGasoline + "リットル分走行しました。");
			gasoline = gasoline - usedGasoline;
		}else {
			System.out.println(message + "不足のため走行てきません。");
		}
	}
	
	
	public void showInfo() {
		System.out.println("車種："+type + " ナンバー：" + number + " ガソリン：" + gasoline +"リットル");
		
	}
	
	
}
