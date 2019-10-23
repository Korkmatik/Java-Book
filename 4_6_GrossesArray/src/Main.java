
public class Main {
	public static void main(String[] args) {
		
		try {
			int[] arr = new int[Integer.MAX_VALUE];
		} 
		catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}
}
