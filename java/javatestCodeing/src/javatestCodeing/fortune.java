package javatestCodeing;
import java.util.Random;

public  class fortune {
	
	static String[] result = {"大吉","中吉","小吉","吉"};
	/* fdsafdsafdsafdsafssd */
	public static String getresult() {
		Random rand = new Random();
		return result[rand.nextInt(3)];
		
	}

}
