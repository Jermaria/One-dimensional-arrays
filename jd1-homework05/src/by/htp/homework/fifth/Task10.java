package by.htp.homework.fifth;

public class Task10 {

	// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 5, 6, 0, 1, 2, -9};
		
		showWanted(arr);
	}
	
	public static void showWanted(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i + 1) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
