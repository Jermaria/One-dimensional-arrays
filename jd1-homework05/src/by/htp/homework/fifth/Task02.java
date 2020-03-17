package by.htp.homework.fifth;

public class Task02 {

	// В целочисленной последовательности есть нулевые элементы. 
	// Создать массив из номеров этих элементов
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {4, 0, 5, 6, 0, 1, 2, 0};
		
		int arr2Length;
		arr2Length = arrLength(arr1);
		
		int[] arr2 = new int[arr2Length];
		
		arrayInit(arr1, arr2);
		printArray(arr2);
	}
	
	public static int arrLength(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void arrayInit(int[] array1, int[] array2) {
		int j;
		j = 0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				array2[j] = i;
				j++;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
}
