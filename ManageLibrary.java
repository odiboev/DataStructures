
import java.util.LinkedList;

public class ManageLibrary {

    public static void main(String[] args) {
        
        //Adding eleemnts to Linked Lists
        
        //Main Books List
        LinkedList<String> MainList = new LinkedList<String>();
        MainList.add("ABC0001");
        MainList.add("ABD0005");
        MainList.add("ABF0007");
        MainList.add("BBC0005");
        MainList.add("BFC0005");
        
        //Books to be removed
        LinkedList<String> ToRemove = new LinkedList<String>();
        ToRemove.add("ABC0001");
        ToRemove.add("ABF0007");

        //New Books to be added to the main list
        LinkedList<String> NewBooks = new LinkedList<String>();
        NewBooks.add("ABE0007");
        NewBooks.add("ABC0003");
        NewBooks.add("BBC0007");

        
        //Removing books
        for (int num = 0; num < MainList.size(); num++) {
            for (int nums = 0; nums < ToRemove.size(); nums++) {
                if (MainList.get(num).equals(ToRemove.get(nums))) {
                    MainList.remove(MainList.get(num));
                    ;
                }
            }
        }

        //for (int num = 0; num < NewBooks.size(); num++) {
        //    MainList.add(NewBooks.get(num));
        //}

        
        //Addimg new books in Alphabetical order
        for (int nums = 0; nums < NewBooks.size(); nums++) {
            boolean added = false;
            for (int num = 0; nums < MainList.size() && (added == false); num++) {
                String n1 = MainList.get(num);
                String n2 = NewBooks.get(nums);
                int value = n1.compareTo(n2);       //Comparing 2 strings
                if (value > 0) {
                    MainList.add(num, n2);
                    added = true;
                }
            }
        }

        System.out.println(MainList);

    }
}
