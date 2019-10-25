
public class Main {
	public static void main(String[] args) {
		float epsilon = 0.00001f;
		double[] d = {
				123.56, 66.184
		};
		
		float[] f = {
				444.234f, 1.111111f
		};
		
		boolean isCorrect = true;

		if (Math.abs(MathFuerArme.round(d[0], 1) - 123.6) > epsilon) {
			System.out.println(MathFuerArme.round(d[0], 1));
			isCorrect = false;
		}
		if (MathFuerArme.round(d[1], 2) - 66.18 > epsilon) {
			System.out.println(MathFuerArme.round(d[0], 1));
			isCorrect = false;
		}
		if (MathFuerArme.round(f[0], 1) - 444.2f > epsilon) {
			System.out.println(MathFuerArme.round(d[0], 1));
			isCorrect=false;
		}
		if (MathFuerArme.round(f[1], 5) - 1.11111f > epsilon) {
			System.out.println(MathFuerArme.round(d[0], 1));
			isCorrect = false;
		}
		
		if (isCorrect) {
			System.out.println("Alles OK");
		}
		else {
			System.out.println("Nicht alles OK");
		}
	}
}
