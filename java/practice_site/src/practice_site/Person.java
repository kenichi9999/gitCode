package practice_site;

public class Person {
	private String name;
	private int age;
	
	
	public void serData(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	public void introduce() {
		System.out.println("わたくしの名前は" + name + "、年齢は"+ age + "歳です。");
		return;
	}
	
	public void compare(Person person) {
		String message = "わたくし" + name + "、" + person.getName() + "さん";
		
		if(age == person.getAge()) {
			message = message +"と同じ年齢です。";
		}else if(age > person.getAge()) {
			message = message +"より"+(age - person.getAge()) + "歳年上です。";
		}else {
			message = message +"より"+(person.getAge()-age) + "歳年下です。";
		}
		
		System.out.println(message);
		
		return;
	}
}
