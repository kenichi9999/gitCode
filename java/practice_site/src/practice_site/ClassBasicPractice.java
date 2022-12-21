package practice_site;

public class ClassBasicPractice {

	public static void main(String[] args) {
		
		Pet pet = new Pet();
		pet.setType("犬");
		pet.setName("コータロー");
		pet.setAge((byte)4);
		pet.setGender(false);
		
		Pet pet2 = new Pet();
		pet2.setType("猫");
		pet2.setName("ミー");
		pet2.setAge((byte)2);
		pet2.setGender(true);
		System.out.println(pet.getIntoroduction());
		System.out.println(pet2.getIntoroduction());
		
		
	}

}
