import java.util.Random;
public class Experiment3 
{
    public static int GenerateRandomNumber()
    {
        Random rand = new Random();
        int myRandom = rand.nextInt(50)+40;
        return myRandom;
    }
    
    public boolean CheckPrime(int n)
    {
        boolean result = false;
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                result = false;
            }
            else{result = true;}
        }
        return result;
    }
    
    public static void PrintPrime(int randomNumber)
    {
        
    }
}
