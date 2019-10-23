
public class HiWi implements StudHilfskraft {

	private double gehalt;
	private String name;
	private int matrNr;
	private int dauer;
	
	public static void main(String[] args) {
		System.out.println("Works");
	}
	
	@Override
	public double getGehalt() {
		return gehalt;
	}

	@Override
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getMatrNr() {
		return matrNr;
	}

	@Override
	public void setMatrNr(int matrNr) {
		this.matrNr = matrNr;
	}

	@Override
	public int getDauer() {
		return dauer;
	}

	@Override
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}

}
