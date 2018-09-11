package Want_To_Keep;

import java.text.DecimalFormat;
import java.util.Scanner;
class AreaCircumfernce
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;
        final String TAB = "\t";
        final String NEWLINE = "\n";
        
        System.out.print("Radius of the circle: ");
        
        Scanner userInput = new Scanner(System.in);
        
        double radius = userInput.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2.0 * PI * radius;
        
        DecimalFormat myFormat = new DecimalFormat("0.000");
        
        System.out.println("\nGiven Radius:  " + myFormat.format(radius) + 
                           "\nArea:          " + myFormat.format(area) +
                           "\nCircumference: " + myFormat.format(circumference));
        
    }
}