package javaalgorithms;

public class ArrayStructures {
	
	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	public void generateRandomArray() {
			for(int i = 0; i < arraySize; i++) {
				theArray[i] = (int)(Math.random()*10)+10;
			}
		
	}
	
	public void printArray() {
		System.out.println("----------");
		for(int i = 0; i < arraySize; i++) {
			System.out.println("| " + i + " |");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
