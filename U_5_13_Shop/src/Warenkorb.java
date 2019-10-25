import java.util.Vector;

public class Warenkorb {
	private Vector warenkorb;
	
	public Warenkorb()
	{
		warenkorb = new Vector();
	}
	
	public void add(Artikel artikel) 
	{
		warenkorb.add(artikel);
	}
	
	public double bestellwert()
	{
		double gesamtPreis = 0.;
		
		for (int i = 0; i < warenkorb.size(); i++) {
			Artikel a = (Artikel) warenkorb.elementAt(i);
			gesamtPreis += a.getMenge() * (double)a.getPreis();
		}
		
		return gesamtPreis;
	}
}
