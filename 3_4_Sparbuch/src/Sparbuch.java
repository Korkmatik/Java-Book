
public class Sparbuch {
	private String kontonummer;
	private double kapital;
	private double zinssatz;
	
	public Sparbuch(String kontonummer, double kapital, double zinssatz) {
		this.kontonummer = kontonummer;
		this.kapital = kapital;
		this.zinssatz = zinssatz;
	}
	
	public void zahleEin(double betrag)
	{
		kapital += betrag;
	}
	
	public void hebeAb(double betrag)
	{
		kapital -= betrag;
	}
	
	public double getErtrag(int laufzeit)
	{
		double ertrag = kapital;
		
		for (int i = 0; i < laufzeit; i++)
		{
			ertrag += ertrag * zinssatz;
		}
		
		return ertrag;
	}
	
	public void verzinse()
	{
		kapital += kapital * zinssatz;
	}
	
	public String getKontonummer() 
	{
		return kontonummer;
	}
	
	public double getKapital()
	{
		return kapital;
	}
	
	public double getZinssatz()
	{
		return zinssatz;
	}
}














