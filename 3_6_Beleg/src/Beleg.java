
public class Beleg {
	private static int BelegNr = 1000;
	private int Belegnummer;
	
	public Beleg() {
		Belegnummer = BelegNr++;
	}
	
	public int getBelegnummer()
	{
		return Belegnummer;
	}
}
