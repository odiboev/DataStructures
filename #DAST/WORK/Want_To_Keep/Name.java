package Want_To_Keep;

import java.util.Scanner;
class Name
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Eneter your name: ");
        String yourName = userInput.nextLine();
        
        String firstName = yourName.substring(0, yourName.indexOf(" "));
        String lastName = yourName.substring(yourName.indexOf(" ") + 1, yourName.length());
        
        System.out.println("Good morning Sir, "
                + "your registered as " + lastName + " " + firstName + " in our System.");
    }
}