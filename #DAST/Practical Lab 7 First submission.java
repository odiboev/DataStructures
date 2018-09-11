
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {

    public static int sumValues(ArrayList<Integer> myList) {
        int sum = 0;
        for (Integer i : myList) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
    
    public static ArrayList printSorted(ArrayList<Integer> myList){
        System.out.println(Collections.sort(myList));
        return Collections.sort(myList);
    }
   
    public static void main(String[] args) {
        ArrayList Integer = new ArrayList();
        
        Integer.add(12);
        Integer.add(14);
        Integer.add(11);
        Integer.add(19);
        Integer.add(13);
        
        System.out.println(Integer);
        sumValues(Integer);
        
        System.out.println(Collections.sort(Integer));
    }
}
