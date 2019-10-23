
public class Main {
	public static void main(String[] args) {
		try {
			Monat monat = new Monat(2);
			System.out.println("This should be printed");
		} catch (MonatException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Monat monat = new Monat(14); 
			System.out.println("This shouldn't be printed");
		} catch (MonatException e) {
			System.out.println(e.getMessage());
		}
	}
}
