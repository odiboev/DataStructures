
import java.util.Arrays;

public class ex5 {

    public static void main(String[] args) {
        int myArray1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int myArray2[] = {2, 5, 7, 9, 12, 35, 56, 32, 16};
        
        int userValue = 12;
        int index = -1;
        for (int i = 0; i < myArray1.length; i++) {
            if (myArray1[i] == userValue) {
               index = i;
            }
        }
         System.out.println("index of value "+userValue+" is "+index);
    }
}
