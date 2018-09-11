package Want_To_Keep;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

class Time
{
    public static void main(String[] args)
    {
        Date today = new Date();
        SimpleDateFormat fullDate = new SimpleDateFormat("H-m-s a");
        
        String theDate = fullDate.format(today);
        
        JFrame myWindow = new JFrame();
        
        myWindow.setLocation(500, 500);
        myWindow.setSize(300, 200);
        myWindow.setTitle(theDate);
        myWindow.setVisible(true);
        myWindow.setVisible(false);
        try {Thread.sleep(500);} catch(Exception e) {}
        myWindow.setVisible(true);
        
    }
}