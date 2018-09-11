import java.util.Scanner;
public class TestMyRectangle 
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Point 1 (x y) : ");
        int x1 = userInput.nextInt();
        int y1 = userInput.nextInt();
        
        System.out.print("Point 2 (x y) : ");
        int x2 = userInput.nextInt();
        int y2 = userInput.nextInt();
        
        MyPoint first = new MyPoint(x1, y1);
        MyPoint second = new MyPoint(x2, y2);
        
        MyRectangle myRect = new MyRectangle(first, second);
        
        System.out.println("\nWidth: " + myRect.getWidth());
        System.out.println("Height: " + myRect.getHeight());
        System.out.println("Area: " + myRect.getSurface());
    }
}
