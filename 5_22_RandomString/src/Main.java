
public class Main {
	public static void main(String[] args) {
		StringGenerator s = new StringGenerator();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(s.random(10));
		}
	}
}
