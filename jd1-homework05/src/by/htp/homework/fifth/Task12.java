package by.htp.homework.fifth;

public class Task12 {

	// Задана последовательность N вещественных чисел. 
	// Вычислить сумму чисел, порядковые номера которых являются простыми числами.
	
	public static void main(String[] args) {
		
		double[] arr = new double [] {5.5, 7.3, 7.1, 1.3, 4.4, 6.4};
		
		double sum = sumSimpleIndexElements(arr);
		
		System.out.println(sum);
	}
	
	public static boolean checkSimple(int x) {
		for (int i = x - 1; i > 1; i--) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double sumSimpleIndexElements(double[] array) {
		double sum;
		sum = 0;
		
		for (int i = 0; i < array.length; i ++) {
			int humanOrder = i + 1;
			
			if (checkSimple(humanOrder)) {
				sum = sum + array[i];
			}
		}
		
		return sum;
	}
}
