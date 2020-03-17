package by.htp.homework.fifth;

public class Task07 {

	// Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
	// Заменить все ее члены, большие данного Z, этим числом.
	// Подсчитать количество замен
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 23, 43, 1, 65, 45, 30};
		int z;
		
		z = 30;
		
		int exceedZ;
		exceedZ = countReplaced(arr, z);
		
		if (exceedZ > 0) {
			System.out.println(exceedZ + " elements will be replaced");
			
			replacement(arr, z);
			printArray(arr);
		}
		
	}
	
	public static int countReplaced(int[] array, int _z) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > _z) {
				counter++;
			}
		}
		return counter;
	}
	
	public static void replacement(int[] array, int _z) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > _z) {
				array[i] = _z;
			}
		}
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
