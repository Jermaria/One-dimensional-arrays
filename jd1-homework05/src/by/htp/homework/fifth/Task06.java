package by.htp.homework.fifth;

public class Task06 {

	// Дана последовательность чисел а1 ,а2 ,..., ап. 
	// Указать наименьшую длину числовой оси, содержащую все эти числа.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 2, -10, 3, 15, 1};
		
		int length;
		
		length = max(arr) - min(arr);
		
		System.out.println(length);
		
	}
	
	public static int min(int[] array) {
		int min;
		min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int max(int[] array) {
		int max;
		max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
