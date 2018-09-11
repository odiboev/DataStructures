package Homework;

import java.util.Scanner;
class CheckOddEven
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        if (userInput.hasNextInt())
        {
            int myNum = userInput.nextInt();
            
            int remainder = myNum%2;
            String evenOdd = null;
            
            if (remainder == 0){
                evenOdd = "Even Number";}
            
            if (remainder == 1){
                evenOdd = "Odd Number";}
            
            System.out.println(evenOdd);
            
        }else{
            System.out.println("BYE!");
        }
    }
}