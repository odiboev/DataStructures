public class SumArrayRecursive 
{
    public static int SumArrayRec(int[] List, int index)
    {
        if(index == List.length - 1){
            return List.length;
        }
        return List[index] + SumArrayRec(List, index + 1);
    }
    
    public static void main(String[] args)
    {
        System.out.println(SumArrayRec(int[1,2,3,4],));
    }
    
}
