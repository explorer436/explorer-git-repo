import java.util.HashSet;
import java.util.Set;

public class MissingInteger
{

    public static void main(String[] args)
    {
        int[] A = {1, 3, 6, 4, 1, 2};     
        System.out.println("result : " + solution(A));
        
        int[] A2 = {1, 2, 3};     
        System.out.println("result : " + solution(A2));
        
        int[] A3 = {-1, -3};     
        System.out.println("result : " + solution(A3));
        
        int[] A4 = {3};     
        System.out.println("result : " + solution(A4));
        
        int[] A5 = {2, 2, 2, 2, 2};
        System.out.println("result : " + solution(A5));
        
        int[] A6 = {};     
        System.out.println("result : " + solution(A6));
        
        System.out.println("result : " + solution(null));
    }
    
    public static int solution(int[] A)
    {
        int result = 1;
        
        if(null == A || 0 == A.length)
        {
            //do nothing
        }
        else
        {
            //Arrays.sort(A);
            
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < A.length; i++){
              set.add(A[i]);
            }
            
            //System.out.println("A.length : " + A.length);
            for(int i=0; i<=A.length; i++)
            {
                //System.out.println("i : " + i);
                //System.out.println("A[i] : " + A[i]);
                if(!set.contains((i+1)))
                {
                    result = i+1;
                    break;
                }
            }
        }
        return result;
    }
}
