package by.htp.homework.fifth;
import java.util.Random;

public class Task18 {
	
	// «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, 
	// в которые надо вставить игральные кубики. Но дверь открывается только в том случае, 
	// когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
	// (Игральный кубик имеет на каждой грани от 1 до 6 точек). 
	// Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.

	public static void main(String[] args) {
		
		int[] lock = new int[10];

		Random rand = new Random();
		
		int index1, index2; // позиции вставленных кубиков
		
		index1 = rand.nextInt(10);
		index2 = rand.nextInt(10);
		
		while (index2 == index1) {	
			index2 = rand.nextInt(10);
		}
		
		int value1, value2;  // значения на кубиках
		
		value1 = rand.nextInt(6) + 1;
		
		int gap;
		gap = countGap(index1, index2);
		
		if (gap % 3 == 0) {		// каждое 4-ое число должно повторяться
			value2 = value1;
		} else {
			value2 = generateSecond(value1);
		}
		
		lock[index1] = value1;
		lock[index2] = value2;
		
		System.out.println("Locked:");
		printArray(lock);
		
		System.out.println();
		
		open(lock, index1, index2, value1, value2);
	}
	
	public static int countGap(int a, int b) {
		int gap;
		
		gap = Math.abs(a - b);
		
		return gap;
	}
	
	public static int generateSecond(int first) { // a + b < 10
		int second;
		
		Random rand = new Random();
		
		if (first == 5) {
			second = rand.nextInt(4) + 1;
		} else if (first == 4) {
			second = rand.nextInt(5) + 1;
		} else if (first == 6) {
			second = rand.nextInt(3) + 1;
		} else {
			second = rand.nextInt(6) + 1;
		}
		return second;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void useOpenRule1(int[] array, int ind1, int ind2, int val1, int val2) {
		
			for (int i = 0; i < array.length; i++) {
				if (countGap(ind1, i) % 3 == 0 ) { // повторения a
					array[i] = val1;
				} else if(countGap(ind2, i) % 3 == 0 ) { // повторения b
					array[i] = val2;
				} else {
					array[i] = 10 - val1 - val2;
				}
			}
		}
		
	public static void useOpenRule2(int[] array, int ind1, int ind2, int val1, int val2) {
		// если в abcabcabca известно лишь a
		
			ind2 = ind1 - 1;
			useOpenRule1(array, ind1, ind2, val1, val2);
		}
	
	public static int chooseStrategy(int[] array, int ind1, int ind2, int val1, int val2) {
		int gap;
		gap = countGap(ind1, ind2);
		
		if (gap % 3 != 0) {	
			useOpenRule1(array, ind1, ind2, val1, val2);
			return 1;
		} else {
			val2 = secondMax(val1);
			useOpenRule2(array, ind1, ind2, val1, val2);
			return 2;
		}
	}
	
	public static int secondMax(int first) {
		int second;
		
		second = 10 - first - 1;
		
		return second;	
	}
	
	public static void open(int[] array, int ind1, int ind2, int val1, int val2) {
		int strategy;
		strategy = chooseStrategy(array, ind1, ind2, val1, val2) ;
		
		System.out.println("Opened:");
		printArray(array);
		
		if (strategy == 2) {
			System.out.println();
			System.out.println("Other combinations:");
			
			for (int i = secondMax(val1); i > 1; i--) {
				val2 = i - 1;
				useOpenRule2(array, ind1, ind2, val1, val2);
				printArray(array);
				System.out.println();
			}
		}
	}
}
