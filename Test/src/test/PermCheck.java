package test;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {4, 1, 3, 2};		
		System.out.println("result : " + solution(A));
		
		int[] A2 = {4, 1, 3};		
		System.out.println("result : " + solution(A2));
		
		int[] A3 = {1};		
		System.out.println("result : " + solution(A3));
		
		int[] A4 = {2};		
		System.out.println("result : " + solution(A4));
		
		int[] A5 = {};		
		System.out.println("result : " + solution(A5));
	}
	
	public static int solution(int[] A)
	{
		int result = 0;
		if (A.length > 0) 
		{
			Arrays.sort(A);
			boolean found = false;
			for (int i = 0; i < A.length; i++) 
			{
				/*System.out.println("i : " + i);
				System.out.println("A[i] : " + A[i]);*/
				if ((i+1) == A[i]) 
				{
					found = true;
				}
				else
				{
					found = false;
					break;
				}
			} 
			
			if(found)
			{
				result = 1;
			}
		}
		return result;
	}

}
