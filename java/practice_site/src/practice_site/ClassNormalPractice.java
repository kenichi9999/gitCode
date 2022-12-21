package practice_site;

public class ClassNormalPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person[] persons = {new Person(),new Person(),new Person()};
		
		persons[0].serData("大島",30);
		persons[1].serData("村上",30);
		persons[2].serData("黒沢",32);
		
		for (Person item :persons ){
			item.introduce();
		}
		
		persons[0].compare(persons[1]);
		persons[0].compare(persons[2]);
		persons[2].compare(persons[1]);
		
	}

}
