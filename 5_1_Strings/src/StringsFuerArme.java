
public class StringsFuerArme {
	
	public static String delimitedString(String s, char start, char end)
	{
		char[] chars = s.toCharArray();
		
		int startPos = -1;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == start) {
				startPos = i;
				break;
			}
		}
		
		// String doesn't contain this char
		if (startPos == -1) {
			return "";
		}
		
		// Starting character is the last character in the string
		if (startPos == chars.length - 1) {
			return "" + chars[startPos];
		}
		
		int endPos = -1;
		for (int i = startPos + 1; i < chars.length; i++) {
			if (chars[i] == end) {
				endPos = i;
				break;
			}
		}
		
		if (endPos == -1) {
			endPos = chars.length - 1;
		}
		
		return new String(chars, startPos, endPos - startPos + 1);
	}
}















