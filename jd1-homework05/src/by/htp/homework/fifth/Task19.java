package by.htp.homework.fifth;

public class Task19 {

	// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
	// Если таких чисел несколько, то определить наименьшее из них.
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 2, 4, 5, 1, 6, 4, 8, 5, 4, 6};
		
		int mostRepeated =  countRepeated(arr);
		
		System.out.println(mostRepeated);
	}
	
	public static int countRepeated(int[] array) {
		
		int toReturn;
		toReturn = array[0];
		
		int previous;
		previous = 1;
		
		for (int i = 0; i < array.length - 1; i++) {
			int counter;
			counter = 1;
			
			for(int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					counter++;
				}
			}
			if (counter > previous) {
				previous = counter;
				toReturn = array[i];
				
			} else if (counter == previous) {
				toReturn = Math.min(toReturn, array[i]);
			}	
		}
		return toReturn;
	}
}
