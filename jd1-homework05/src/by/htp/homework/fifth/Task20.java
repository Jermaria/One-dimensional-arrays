package by.htp.homework.fifth;

public class Task20 {

	// Дан целочисленный массив с количеством элементов п. 
	// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
	// Примечание. Дополнительный массив не использовать.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 2, 4, 5, 6, 4, 8, 5, 4, 6};
		
		dropEven(arr);
		
		printArray(arr);
	}
	
	public static void dropEven(int[] array) {
		
		int indexShift;
		indexShift = 1;
		
		for (int i = 1; i < array.length; i = i+2) {
			for (int j = indexShift; j < array.length - 1; j++) {
				array[j] = array[j+1];
			}
			array[array.length - 1] = 0;
			indexShift++;
		}
	}

	public static void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
