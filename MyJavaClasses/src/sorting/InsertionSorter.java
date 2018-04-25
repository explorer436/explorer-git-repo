package sorting;

import java.util.Random;

public class InsertionSorter
{
	// private int [] a;
	// private int n;

	private static int[] numbers;
	private final static int SIZE = 100000000;
	private final static int MAX = 1000000;

	public static void main(String[] args)
	{
		// set up
		numbers = new int[SIZE];
		Random generator = new Random(MAX);
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = generator.nextInt(MAX);
		}

		// test
		long startTime = System.currentTimeMillis();

		sort(numbers);

		for (int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i] > numbers[i + 1])
			{
				System.out.println("Should not happen");
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);

	}

	public static void sort(int[] a)
	{
		numbers = numbers;
		// SIZE = numbers.length;
		insertionsort();
	}

	private static void insertionsort()
	{
		int i, j, t;
		for (i = 1; i < SIZE; i++)
		{
			j = i;
			t = numbers[j];
			while (j > 0 && numbers[j - 1] > t)
			{
				numbers[j] = numbers[j - 1];
				j--;
			}
			numbers[j] = t;
		}
	}

}
