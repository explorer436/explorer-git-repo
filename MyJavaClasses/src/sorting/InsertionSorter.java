package sorting;

/*
 * Example:   The following table shows the sorting steps for sorting the sequence 5 7 0 3 4 2 6 1. On the left side, in green, is the already sorted part of the sequence. On the far right is the number of positions in parentheses around which the inserted element has moved to the left.

5	7	0	3	4	2	6	1	 	(0)
5	7	0	3	4	2	6	1	 	(0)
0	5	7	3	4	2	6	1	 	(2)
0	3	5	7	4	2	6	1	 	(2)
0	3	4	5	7	2	6	1	 	(2)
0	2	3	4	5	7	6	1	 	(4)
0	2	3	4	5	6	7	1	 	(1)
0	1	2	3	4	5	6	7	 	(6)

 */
public class InsertionSorter
{
	// private int [] a;
	// private int n;

	public static void sort(int[] a)
	{
		// this .a = a;
		// n = a.length;
		// insertionsort ();
	}

	private static void insertionsort(int[] a)
	{
		int n = a.length;
		int i, j, temp;
		for (i = 1; i < n; i++)
		{
			System.out.println();
			System.out.print("iteration " + (i));
			j = i;
			System.out.print("\t j : " + j);
			System.out.print("\t a[j] : " + a[j]);
			temp = a[j];
			System.out.print("\t temp : " + temp);
			System.out.print("\t a[j - 1] : " + a[j - 1]);
			// System.out.println("i : " + i + ", j : " + j + ", temp : " + temp);
			while (j > 0 && a[j - 1] > temp)
			{
				// System.out.println("j : " + j);
				// System.out.println("a[j - 1] : " + a[j - 1]);
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
			System.out.print(" :: ");
			for (int abcd : a)
			{
				System.out.print("\t" + abcd);
			}
		}
	}

	public static void main(String[] args)
	{
		System.out.println("in main");
		int[] a = new int[] { 5, 7, 0, 3, 4, 2, 6, 1 };
		System.out.println();
		System.out.print("before sorting :: ");
		for (int i : a)
		{
			System.out.print("\t" + i);
		}
		insertionsort(a);
		System.out.println();
		System.out.print("after sorting :: ");
		for (int i : a)
		{
			System.out.print("\t" + i);
		}
	}

} // end class InsertionSorter
