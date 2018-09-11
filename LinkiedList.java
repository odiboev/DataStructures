
import java.util.LinkedList;

public class LinkiedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(11);
        linkedlist.add(22);
        linkedlist.add(33);
        linkedlist.add(44);
        linkedlist.add(55);

        for (int num = linkedlist.size() - 1; num >= 0; num--) {
            System.out.println(linkedlist.get(num));
        }
        
        int total = 0;
        
        for (int num = linkedlist.size() - 1; num >= 0; num--) {
            total = total + linkedlist.get(num);
        }
        
        int average = total/linkedlist.size();
        //System.out.println("\nAverage: " + average);
        System.out.println();
        
        for (int num = 0; num < linkedlist.size(); num++) {
            int number = linkedlist.get(num);
            if(number < average){
                System.out.print(number + ", ");
            }
        }
    }
}
