
public class Ringpuffer {
	
	private int position;
	private int[] data;
	
	
	public Ringpuffer(int size) {
		position = 0;
		data = new int[size];
	}
	
	public void addData(int data) 
	{
		this.data[position++] = data;
		
		if (position >= this.data.length) {
			position = 0;
		}
	}
	
	public void showPuffer()
	{
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
		position = 0;
	}
}
