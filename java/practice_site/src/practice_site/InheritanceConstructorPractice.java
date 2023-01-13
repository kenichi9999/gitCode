package practice_site;

public class InheritanceConstructorPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Magazine magazine = new Magazine("東京Runner",650,"上野彩");
		
		magazine.show();
		
	}

}


class Book{
	private String title;
	private int price;
	
	public Book(String title,int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTItle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
}

class Magazine extends Book{
	
	private String coverPersonName;
	
	Magazine(String title,int price,String coverPersonName){
		
		super(title,price);
		this.coverPersonName = coverPersonName;
	}
	
	public void  show() {
		System.out.println(super.getTItle()+"絶賛発売中！！");
		System.out.println("定価 "+super.getPrice() + "円");
		System.out.println("今回の表紙："+ coverPersonName + "さん");
		
	}
	
}