package by.htp.homework.fifth;

public class Task01 {

	// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
	
	public static void main(String[] args) {
		
		int[] a = new int [] {21, 34, 24, 70, 3, 5};
		int k;
		
		k = 7;
		
		int sum;
		sum = sumDiv(a, k);
		
		System.out.println("sum = " + sum);
	}
	
	public static int sumDiv(int[] array, int divisor) {
		int sum;
		sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % divisor == 0) {
				sum = sum + array[i];
			}
		}
		return sum;
	}
}
