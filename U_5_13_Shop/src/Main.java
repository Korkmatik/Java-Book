
public class Main {
	public static void main(String[] args) {
		String[] ids = {
				"1", "2", "3"
		};
		float[] preise = {
				55.f, 33.5f, 77.34f
		};
		int[] mengen = {
				10, 2, 50
		};
		
		Artikel[] artikel = new Artikel[3];
		Warenkorb wk = new Warenkorb();
		
		for (int i = 0; i < artikel.length; i++) {
			artikel[i] = new Artikel(ids[i], preise[i], mengen[i]);
			wk.add(artikel[i]);
		}
		
		double gesamtPreis1 = 0.;
		for(int i = 0; i < preise.length; i++) {
			gesamtPreis1 += preise[i] * mengen[i];
		}
		
		double gesamtPreis2 = 0.;
		for (int i = 0; i < artikel.length; i++) {
			gesamtPreis2 += artikel[i].getMenge() * artikel[i].getPreis();
		}
		
		System.out.println(gesamtPreis1 + "\n" + gesamtPreis2 + "\n" + wk.bestellwert() + "\n");
		double epsilon = 0.009;
		
		if (Math.abs(gesamtPreis1 - gesamtPreis2) < epsilon && Math.abs(gesamtPreis2 - wk.bestellwert()) < epsilon) {
			System.out.println("Alles funktioniert");
		}
		else {
			System.out.println("Es funktioniert nicht");
		}
	}
}
 