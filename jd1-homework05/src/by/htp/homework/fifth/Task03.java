package by.htp.homework.fifth;

public class Task03 {

	// Дана последовательность целых чисел а1 а2,..., аn . 
	// Выяснить, какое число встречается раньше - положительное или отрицательное.
	
	public static void main(String[] args) {
		int[] sequence = new int[] {-5, 3, -5, 3};
		
		if (sequence[0] > 0) {
			System.out.println("Positive");
		} else if (sequence[0] < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("It's 0");
		}
	}
}
