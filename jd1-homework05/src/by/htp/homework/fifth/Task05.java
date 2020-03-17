package by.htp.homework.fifth;

public class Task05 {

	// Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
	// Создать массив из четных чисел этой последовательности.
	// Если таких чисел нет, то вывести сообщение об этом факте.
	
	public static void main(String[] args) {
		
		int[] arr1 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int arr2length;
		arr2length = countEven(arr1);
		
		if (arr2length == 0) {
			System.out.println("No even elements found");
		} else {
			int[] arr2 = new int[arr2length];
			
			arrayInit(arr1, arr2);
			
			printArray(arr2);
		}
	}
	
	public static int countEven(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void arrayInit(int[] array1, int[] array2) {
		int j;
		j = 0;
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
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
