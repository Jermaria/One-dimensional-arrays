package by.htp.homework.fifth;

public class Task11 {
	
	// Даны натуральные числа а1 ,а2 ,..., аn . 
	// Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1)

	public static void main(String[] args) {

		int[] arr = new int [] {21, 34, 24, 70, 30, 50};
		
		int m, l;
		
		m = 7;
		l = 3;
		
		showWanted(arr, m, l);
	}
	
	public static void showWanted(int[] array, int divisor, int remainder) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divisor == remainder) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
