import java.sql.Array;
import java.util.Random;

public class Calculations {

	static int firstSum = 0;
	static int secondSum = 0;
	static int totalSum = 0;

	public static void main(String[] args) {

		int[] arrayInt = new int[20]; // 200000000
		int l = arrayInt.length;

		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = randomFill();
			System.out.println(arrayInt[i]);
		}

		sum(arrayInt);

		System.out.println("Sum of array elements equals: " + sum(arrayInt));

		sum1stHalf(arrayInt, l);
		System.out.println("ADDED FIRST HALF " + firstSum);

		sum2ndHalf(arrayInt, l);
		System.out.println("ADDED SECOND HALF " + secondSum);
		
		totalSum =  firstSum + secondSum;
		
		System.out.println("Total:  "+ totalSum);

	}

	private static int sum1stHalf(int[] arrayInt, int l) {

		for (int i = 0; i < l; i++) {

			// Add elements in first half sum
			if (i < l / 2) {
				firstSum += arrayInt[i];
			}

		}

		System.out.println("Sum of first half elements is " + firstSum);

		return firstSum;

	}

	private static int sum2ndHalf(int[] arrayInt, int l) {

		for (int i = 0; i < l; i++) {

			// Add elements in first half sum
			if (i > l / 2) {
				secondSum += arrayInt[i];
			}

		}

		System.out.println("Sum of first half elements is " + secondSum);

		return secondSum;

	}

	private static int sum(int[] arrayInt) {

		int sum = 0; // initialize sum
		int i;

		// Iterate through all elements and add them to sum
		for (i = 0; i < arrayInt.length; i++)
			sum += arrayInt[i];

		return sum;

	}

	private static int randomFill() {
		return (new Random()).nextInt();

	}

}
