import java.util.Random;

public class StringGenerator {
	
	public static String random(int length)
	{
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int alphabet_length = alphabet.length();
		
		String returnValue = "";
		
		Random randNumber = new Random();
		
		for (int i = 0; i < length; i++) {
			returnValue += alphabet.charAt(randNumber.nextInt(alphabet_length));
		}
		
		return returnValue;
	}
}
