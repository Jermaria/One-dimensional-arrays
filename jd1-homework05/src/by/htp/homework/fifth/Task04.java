package by.htp.homework.fifth;

public class Task04 {

	// Дана последовательность действительных чисел а1 а2 ,..., аn . 
	// Выяснить, будет ли она возрастающей.
	
	public static void main(String[] args) {
		
		int[] sequence = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 7};
		
		if (checkIncreasing(sequence)) {
			System.out.println("the sequence is increasing");
		} else {
			System.out.println("It's not increasing");
		}
		
	}
	
	public static boolean checkIncreasing(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] >= array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
