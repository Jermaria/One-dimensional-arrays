package by.htp.homework.fifth;

public class Task08 {
	
	// Дан массив действительных чисел, размерность которого N. 
	// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {-2, 0, 23, -43, 1, 0, -65, 45, 30};
		
		int positive, negative, zero;
		
		positive = countPositive(arr);
		negative = countNegative(arr);
		zero = countZero(arr);
		
		System.out.println(positive);
		System.out.println(negative);
		System.out.println(zero);
	}
	
	public static int countPositive(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				counter ++;
			}
		}
		return counter;
	}
	
	public static int countNegative(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				counter ++;
			}
		}
		return counter;
	}
	
	public static int countZero(int[] array) {
		int counter;
		counter = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				counter ++;
			}
		}
		return counter;
	}
}
