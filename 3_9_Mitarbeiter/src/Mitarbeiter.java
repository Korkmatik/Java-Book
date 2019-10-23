
public abstract class Mitarbeiter {
	protected String nachname;
	protected String vorname;
	protected double gehalt;
	
	public Mitarbeiter(String nachname, String vorname, double gehalt)
	{
		this.nachname = nachname;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}
	
	// Erhöhung des Gehalts um betrag
	public void erhoeheGehalt(double betrag)
	{
		gehalt += betrag;
	}
	
	// Ausgabe aller Variableninhalte
	public void zeigeDaten()
	{
		System.out.println("Nachname: " + nachname);
		System.out.println("Vorname: " + vorname);
		System.out.println("Gehalt: " + gehalt);
	}
	
	// Gehalt durch Zulage erhöhen
	public abstract void addZulage(double betrag);
}
