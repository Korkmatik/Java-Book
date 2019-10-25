
public class MathFuerArme {
	
	public static float round(float x, int digits) 
	{
		return (float) (Math.round(x * Math.pow(10, digits)) * Math.pow(10, -digits));	
	}
	
	public static double round(double x, int digits) 
	{
		return (Math.round(x * Math.pow(10, digits)) * Math.pow(10, -digits));	
	}
}
