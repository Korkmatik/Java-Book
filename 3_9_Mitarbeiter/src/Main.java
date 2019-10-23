
public class Main {
	public static void main(String[] args) {
		Azubi azubi = new Azubi("Mustermann", "Azubi", 820.);
		
		azubi.setPruefungen(4);
		azubi.addZulage(60.);
		azubi.zeigeDaten();
		
		Angestellter angestellter = new Angestellter("Mustermann", "Angestellter", 2600.);
		angestellter.befoerdere();
		angestellter.erhoeheGehalt(200.);
		angestellter.zeigeDaten();
		
		for (int i = 0; i < 10; i++) {
			angestellter.befoerdere();
		}
		angestellter.erhoeheGehalt(200.);
		angestellter.zeigeDaten();
	}
}
