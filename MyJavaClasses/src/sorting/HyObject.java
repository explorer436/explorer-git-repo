package sorting;

import java.util.Random;

public class HyObject implements Comparable
{
	private Object data;
	private int keyValue;
	private static Random randomGenerator;

	public static void setRandom(int s)
	{
		randomGenerator = new Random(s);
	}

	public HyObject()
	{
		data = null;
		keyValue = randomGenerator.nextInt();
	}

	public int compareTo(Object d)
	{
		if (this.keyValue > ((HyObject) d).keyValue)
		{
			return 1;
		}
		else if (this.keyValue < ((HyObject) d).keyValue)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	public String toString()
	{
		return String.valueOf(keyValue);
	}
}