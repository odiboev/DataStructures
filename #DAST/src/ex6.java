
public class ex6 {

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 5;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (i + j == num) {
                    System.out.println("The pair: " + i + "+" + j);
                }
            }
        }
    }
}
