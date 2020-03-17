package by.htp.homework.fifth;

public class Task15 {

	// Дана последовательность действительных чисел a1,a2,,an . 
	// Указать те ее элементы, которые принадлежат отрезку [с, d]
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 4, 6, 2, 5, 7, 9, 1};
		int c;
		int d;
		
		c = 2;
		d = 5;
		
		for (int i = c - 1; i < d; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
