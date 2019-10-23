
public class Main {
	public static void main(String[] args) {
		int[] testData = {
				25, 7, 300
		};
		
		for (int age : testData) {
			try {
				Person p = new Person(age);
			} catch (OutOfRangeException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
