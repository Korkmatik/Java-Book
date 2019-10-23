
public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
		{
			Beleg b = new Beleg();
			System.out.println("Beleg #" + b.getBelegnummer() + " kreiert");
		}
	}
}
