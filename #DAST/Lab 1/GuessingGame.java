package Homework;

import java.util.Scanner;
import java.util.Random;
class GuessingGame
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        
        int numRandom = random.nextInt(1000)+1;
        int numTries = 0;
        boolean victory = false;
        
        while(victory == false)
        {
            System.out.print("Guess a number between 1 and 1000: ");
            int yourGuess = userInput.nextInt();
            numTries++;
            
            if(yourGuess == numRandom){
                victory = true;
            }
            else if(yourGuess < numRandom){
                System.out.println("Too low");
            }
            else if(yourGuess > numRandom){
                System.out.println("Too high");
            }
            else{
                System.out.println("Please enter a valid number");
            }
        }
        
        System.out.println("\nCongratulations!");
        System.out.println("The number was: " + numRandom);
        System.out.println("You guessed the number in " + numTries + " tries.");
    }
}