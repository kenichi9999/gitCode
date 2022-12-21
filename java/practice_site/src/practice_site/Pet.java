package practice_site;

public class Pet {
	private String type;
	private String name;
	private byte age;
	private boolean gender;
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getIntoroduction() {
		
		String gen = "";
		if(gender) {
			gen = "メス";
		}else {
			gen = "オス";
		}
		
		return type + "の" +  name + "は" + gen +"で"+ age + "歳です。";
		 
	}
	
}
