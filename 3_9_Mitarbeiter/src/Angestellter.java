
public class Angestellter extends Mitarbeiter {
	private static final int MAX_STUFE = 5;
	private int stufe;
	
	public Angestellter(String nachname, String vorname, double gehalt)
	{
		super(nachname, vorname, gehalt);
	}
	
	public void befoerdere()
	{
		if (stufe < MAX_STUFE) {
			stufe += 1;
		}
	}
	
	// Ausgabe aller Variableninhalte
	public void zeigeDaten()
	{
		super.zeigeDaten();
		
		System.out.println("Stufe: " + stufe);
	}

	@Override
	public void addZulage(double betrag) {
		if (stufe > 1) {
			erhoeheGehalt(betrag);
		}
	}
}