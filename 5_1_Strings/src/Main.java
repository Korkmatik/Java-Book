
public class Main {
	public static void main(String[] args) {
		String test = "Somebody once told me the world is gonna roll me";
		String test2 = "roll me";
		
		String somebody = StringsFuerArme.delimitedString(test, 'S', 'y');
		String world = StringsFuerArme.delimitedString(test, 'w', 'd');
		String me = StringsFuerArme.delimitedString(test2, 'm', 'x');
		String empty = StringsFuerArme.delimitedString(test2, 'x', 'e');
		
		System.out.println("Var\t\tContent\n" +
							"somebody\t\t" + somebody + "\n" +
							"world\t\t" + world + "\n" +
							"me\t\t" + me + "\n" +
							"empty\t\t" + empty + "\n");
		
		if (somebody.equals("Somebody") && 
			world.equals("world") &&
			me.equals("me") && 
			empty.equals("")) {
			
			System.out.println("Delimited String function works fine");
		}
		else {
			System.out.println("Delimited String function doesn't work");
		}
		
	}
}
