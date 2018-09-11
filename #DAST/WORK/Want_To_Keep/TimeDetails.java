package Want_To_Keep;

import java.util.*;
class TimeDetails
{
    public static void main(String[] args)
    {
        GregorianCalendar cal = new GregorianCalendar();
        
        System.out.println("Time: " + cal.getTime() +
                           "\nYEAR: " + cal.get(Calendar.YEAR) +
                           "\nMONTH: " + cal.get(Calendar.MONTH) + 
                           "\nDATE: " + cal.get(Calendar.DATE) + 
                           "\nDAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK)); 
    }
}