package Want_To_Keep;

import javax.swing.JFrame;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
class Cool_App
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Title Name: ");
        String title = userInput.nextLine();
        
        System.out.print("Frame Height: ");
        int height = userInput.nextInt();
        
        System.out.print("Frame Width: ");
        int width = userInput.nextInt();
        
        JFrame myWindow = new JFrame();
        
        myWindow.setTitle(title);
        myWindow.setSize(width, height);
        myWindow.setVisible(true);
    }
}