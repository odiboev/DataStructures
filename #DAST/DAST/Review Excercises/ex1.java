
public class ex1 {

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int userNum = 5;
        
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == userNum){
                System.out.println(i);
            }
        }
    }
}
