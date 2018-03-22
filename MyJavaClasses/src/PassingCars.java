public class PassingCars
{

    public static void main(String[] args) throws Exception
    {
        if(5 != solution(new int[]{0,1,0,1,1}))
        {
            throw new Exception("wrong answer");
        }
        
        if(1 != solution(new int[]{0,1}))
        {
            throw new Exception("wrong answer");
        }
        
        if(0 != solution(new int[]{1,0}))
        {
            throw new Exception("wrong answer");
        }        
        
        System.out.println("all good");
    }
    
    public static int solution(int[] A)
    {
        int right_count = 0, passingCars = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0)
            {
                right_count = right_count + 1;
            }                
            if (A[i] == 1)
            {
                //the car is going left
                passingCars = passingCars + right_count;
            }                
            if (passingCars > 1000000000)
            {
                return -1;
            }                
        }
        return passingCars;
    }
}
