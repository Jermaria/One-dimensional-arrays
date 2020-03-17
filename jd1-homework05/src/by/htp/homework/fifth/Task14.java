package by.htp.homework.fifth;

public class Task14 {

	// Дан одномерный массив A[N]. Найти: max(a2,a4,,a2k) + min(a1,a3,,a2k+1)
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 4, 6, 2, 5, 7, 9, 1};
		
		int sum;
		
		sum = maxOdd(arr) + minEven(arr);
		
		System.out.println(sum);
		
	}
	// тк в массиве индексация от 0,
	// min(a1,a3,,a2k+1) т.е. min из нечетных эл-тов последовательности - 
	// это  min среди четных элементов массива
	
	public static int minEven(int[] array) {
		int min;
		min = array[0];
		
		for (int i = 2; i < array.length; i = i + 2) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int maxOdd(int[] array) {
		int max;
		max = array[1];
		
		for (int i = 3; i < array.length; i = i + 2) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
