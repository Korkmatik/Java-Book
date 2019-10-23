
public class Main {
	public static void main(String[] args) {
		Ringpuffer puffer = new Ringpuffer(10);
		
		for (int i = 0; i < 10; i++) {
			puffer.addData(i);
		}
		puffer.showPuffer();
		
		for (int i = 0; i < 15; i++) {
			puffer.addData(i);
		}
		puffer.showPuffer();
	}
}
