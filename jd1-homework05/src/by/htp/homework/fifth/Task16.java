package by.htp.homework.fifth;

public class Task16 {

	// Даны действительные числа a1,a2,,an . 
	// Найти max(a1 + a2n,a2 + a2n−1,,an + an+1).
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 4, 6, 2, 5, 7, 9, 1};
		
		int maxSum;
		maxSum = countMax(arr);
		
		System.out.println(maxSum);
	}
	
	public static int countMax(int[] array) {

		int max;
		max = array[0] + array[1];
		
		for (int i = 1; i < array.length - 1; i++) {
			int sum;
			sum = array[i] + array[i + 1];
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}
}
