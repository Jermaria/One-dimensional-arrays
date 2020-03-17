package by.htp.homework.fifth;

public class Task09 {

	// Даны действительные числа а1 ,а2 ,..., аn . 
	// Поменять местами наибольший и наименьший элементы.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 5, 6, 0, 1, 2, -9};
		
		replacement(arr);
		
		printArray(arr);
	}
	
	public static int indexMin(int[] array) {
		int indexMin;
		indexMin = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[indexMin]) {
				indexMin = i;
			}
		}
		
		return indexMin;
	}
	
	public static int indexMax(int[] array) {
		int indexMax;
		indexMax = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[indexMax]) {
				indexMax = i;
			}
		}
		
		return indexMax;
	}
	
	public static void replacement(int[] array) {
		
		int temp;
		
		temp = array[indexMin(array)];
		array[indexMin(array)] = array[indexMax(array)];
		array[indexMax(array)] = temp;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
