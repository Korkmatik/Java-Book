
public class Azubi extends Mitarbeiter {
	private int abgelegtePruefungen;
	
	public Azubi(String nachname, String vorname, double gehalt)
	{
		super(nachname, vorname, gehalt);

		abgelegtePruefungen = 0;
	}
	
	// Zahl der abgelegten Prüfungen setzen
	public void setPruefungen(int anzahl)
	{
		abgelegtePruefungen += anzahl;
	}
	
	// Ausgabe aller Variableninhalte
	public void zeigeDaten()
	{
		super.zeigeDaten();
		System.out.println("Abgelegte Prüfungen: " + abgelegtePruefungen);
	}

	@Override
	public void addZulage(double betrag) {
		if (abgelegtePruefungen > 3)
		{
			erhoeheGehalt(betrag);
		}
	}
}
