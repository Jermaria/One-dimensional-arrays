package by.htp.homework.fifth;

public class Task13 {

	// Определить количество элементов последовательности натуральных чисел, 
	// кратных числу М и заключенных в промежутке от L до N.
	
	public static void main(String[] args) {

		int[] arr = new int[] {4, 53, 6, 3, 1, 2, 9, 22, 34};
		
		int m;
		int l;
		int n;
		
		m = 2;
		l = 2;
		n = 25;
		
		int num;
		num = countNum(arr, m, l, n);
		
		System.out.println(num);
	}
	
	public static boolean ifDivided(int x, int divisor) {
		if (x % divisor == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean ifWithin(int x, int first, int last) {
		if (x >= first && x <= last) {
			return true;
		}
		return false;
	}
	
	public static int countNum(int[] array, int divisor, int first, int last) {
		
		int num;
		num = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (ifDivided(array[i], divisor) && ifWithin(array[i], first, last)) {
				num++;
			}
		}
		return num;
	}
	
}
