package practice_site;

public class ConstructorBasicPractice {

	public static void main(String[] args) {
		Square square = new Square(4.5,2.8);
		
		square.inform();
		System.out.println("この四角形の面積は"+square.getArea()+"です。");
		
		square.addWidth(3.0);
		
		square.inform();
		System.out.println("この四角形の面積は"+square.getArea()+"です。");
	}

}

class Square {
	private double width;
	private double height;
	
	Square(double width,double height){
		this.width = width;
		this.height = height;
	}
	
	public void inform() {
		System.out.println("この四角形の幅は"+ width +"、高さは"+ height +"です。");
		return ;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public void addWidth(double addwidth) {
		width = width + addwidth;
		return;
	}
}
