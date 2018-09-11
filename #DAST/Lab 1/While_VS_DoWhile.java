package Homework;

class While_VS_DoWhile
{
    public static void main(String[] args)
    {
        int maxValue = 10;
        int initialValue = 1;
        
        while(initialValue <= maxValue){
            System.out.println(initialValue);
            initialValue++;
        }
        System.out.println(initialValue);
    }
}