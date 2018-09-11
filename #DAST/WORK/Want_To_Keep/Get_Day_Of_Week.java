import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

class Get_Day_Of_Week
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int year, month, day;
        
        System.out.print("Year (yyyy): ");
        year = userInput.nextInt();
        
        System.out.print("Month (1-12): ");
        month = userInput.nextInt();
        
        System.out.print("Day (1-31): ");
        day = userInput.nextInt();
        
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        
        System.out.println("\nDay of the Week: " + sdf.format(cal.getTime())); 
    }
}