
public class Artikel {
	private String id;
	private float preis;
	private int menge;
	
	public Artikel(String id, float preis, int menge) {
		this.id = id;
		this.preis = preis;
		if (menge < 0) {
			menge = 0;
		}
		this.menge = menge;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public float getPreis()
	{
		return preis;
	}
	
	public void setPreis(float preis) {
		this.preis = preis;
	}
	
	public int getMenge() {
		return menge;
	}
	
	public void setMenge(int menge) {
		if (menge < 0) {
			menge = 0;
		}
		this.menge = menge;
	}
}
