
public class Main {
	public static void main(String[] args) {
		Sparbuch meinSparbuch = new Sparbuch("123456789", 500., 0.015);
		
		System.out.println("Kontonummer: " + meinSparbuch.getKontonummer()); 
		System.out.println("Kapital: " + meinSparbuch.getKapital());
		System.out.println("Zinssatz: " + meinSparbuch.getZinssatz());
		
		meinSparbuch.zahleEin(25.);
		System.out.println("Kapital nachdem 25 Euro eingezahlt wurde: " + meinSparbuch.getKapital());
		
		meinSparbuch.hebeAb(10.);
		System.out.println("Kapital nachdem 10 Euro abgehoben wurde: " + meinSparbuch.getKapital());
		
		int laufzeit = 10;
		double neuesKapital = meinSparbuch.getErtrag(laufzeit);
		System.out.println("Kapital nach 10 Jahren: " + neuesKapital);
	}
}
