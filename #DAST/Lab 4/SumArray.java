public class SumArray 
{
    public static int SumArray(int[] myList)
    {
        int sum = 0;
        
        for(int i :myList)
        {
            sum += i  ;
            
        }
        
        return sum;
    }
    
    public static void main(String[] args)
    {
        int[] myArray = {1,2,3,4,5,6};
        
        System.out.println("Sum of your array: " + SumArray(myArray));
    }
    
    
}

