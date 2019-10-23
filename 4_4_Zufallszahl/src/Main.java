
public class Main {
	public static void main(String[] args) {
		
		try {
			int zufallszahl = 666;
			while(true) {
				zufallszahl =  (int) (Math.random() * 100);
				
				if (zufallszahl == 0) {
					throw new Exception("Zufallszahl hat Wert 0 erreicht");
				}
			}
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
