
public class Person {
	
	public Person(int age) throws OutOfRangeException
	{
		if (age < 0 || age > 150) {
			throw new OutOfRangeException(age, 0, 150);
		}
	}
}
