public class recursiveTest 
{
    public static int sumValues(int n)
    {
        if(n == 1){
            return 1;
        }
        return n + sumValues(n-1);
    }
    
    public static void main(String[] args)
    {
        System.out.println(sumValues(9));
    }
}
