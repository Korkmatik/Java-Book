
public class Main {
	public static void main(String[] args) {
		
		// Generating test data
		int[] testData = new int[5];
		for (int i = 0; i < testData.length; i++) {
			testData[i] = i;
		}
		
		Queue queue = new Queue();
		
		
		// Testing leave with a empty queue
		if (queue.leave() == 0) {
			System.out.println("Leave with empty queue works");
		}
		else {
			System.out.println("Leave with empty queue doesn't work");
		}
		
		
		// Testing enter and leave with one value
		int testValue = 1;
		queue.enter(testValue);
		if (queue.leave() == testValue) {
			System.out.println("Enter and leave work with one value");
		}
		else {
			System.out.println("Enter and leave doesn't work with one value");
		}
		
		
		// Testing enter and leave with multiple values two times
		boolean isWorking = true;
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < testData.length; i++) {
				queue.enter(testData[i]);
			}
			
			for (int i = 0; i < testData.length; i++) {
				if (queue.leave() != testData[i]) {
					isWorking = false;
					break;
				}
			}
			
			if (!isWorking) {
				break;
			}
		}
		
		if (isWorking) {
			System.out.println("Leave and Enter are working with multiple values");
		}
		else {
			System.out.println("Leave and Enter aren't working with multiple values");
		}
	}
}





















