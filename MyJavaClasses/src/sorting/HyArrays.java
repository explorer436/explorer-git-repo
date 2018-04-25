package sorting;

/**
 * HyArrays.java This class contains sorting methods similar to
 * java.util.Arrays. All sorting methods should have a signature of
 * %Sort(Object[] a, int fromIndex, int toIndex) where "fromIndex" is inclusive,
 * and "toIndex" is exclusive. Copyright (c) 2011 by Dr. Herong Yang,
 * herongyang.com
 */
public class HyArrays
{
	public static void insertionSort(Object[] a, int fromIndex, int toIndex)
	{
		Object d;
		for (int i = fromIndex + 1; i < toIndex; i++)
		{
			d = a[i];
			int j = i;
			while (j > fromIndex && ((Comparable) a[j - 1]).compareTo(d) > 0)
			{
				a[j] = a[j - 1];
				j--;
			}
			a[j] = d;
		}
	}
}
