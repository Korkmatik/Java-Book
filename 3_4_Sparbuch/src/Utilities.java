
public class Utilities {

	private static int zeigeAufrufNummer = 0;
	
	public static void zeige(Anzeigbar a)
	{
		System.out.println("Aufrufnummer: " + ++zeigeAufrufNummer);
		
		a.zeige();
	}
}
