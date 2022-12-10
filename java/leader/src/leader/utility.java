package leader;

import java.util.Random;

public class utility {
	public static Integer getRandomValue() {
		Random random = new Random();
		return random.nextInt(100); 
	}
}
