
public class OutOfRangeException extends Exception {
	
	public OutOfRangeException(int value, int min, int max) {
		super("Value should be between " + min + " and " + max + ". Your value: " + value);
	}
}
