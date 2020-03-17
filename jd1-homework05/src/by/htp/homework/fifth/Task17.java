package by.htp.homework.fifth;

public class Task17 {

	// Дана последовательность целых чисел a1,a2,,an . 
	// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,,an).
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {3, 4, 6, 1, 2, 5, 7, 9, 1};
		
		int length = countLength(arr1);
		
		int[] arr2 = new int[length]; 
		
		arrayInit(arr1, arr2);
		
		printArray(arr2);
	}

	public static int min(int[] arr) {
		int min;
		min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int countLength(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != min(array)) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void arrayInit(int[] array1, int[] array2) {
		int j;
		j = 0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != min(array1)) {
				array2[j] = array1[i];
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
