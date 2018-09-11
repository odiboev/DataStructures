package Homework;

import java.util.Scanner;
class Age
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int yourAge = userInput.nextInt();
        
        String result;
        
        if (yourAge < 18){
            result = "User is below 18";
        }
        else if ((yourAge > 18)||(yourAge < 50)){
            result = "User is between 18 and 50";
        }
        else{
            result = "User is above 50";
        }
        
        System.out.println(result);
    }
}