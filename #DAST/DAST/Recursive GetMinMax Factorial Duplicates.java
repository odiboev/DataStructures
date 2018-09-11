
import java.util.*;

public class NewClass {

    public static void viewReverse(int[] myArray) {             //Q1
        System.out.print("Reversed Array: ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
    }

    public static int getMaxValue(int[] myArray) {              //Q2
        int maxValue = myArray[0];
        for (int m = 0, n = 1; n < myArray.length; m++, n++) {
            if (myArray[m] > maxValue) {
                maxValue = myArray[m];
            } else if (myArray[n] > maxValue) {
                maxValue = myArray[n];
            }
        }
        System.out.println("\nMaximum Value: " + maxValue);
        return maxValue;
    }

    public static List getDuplicateElements(int[] myArray) {    //Q3
        List myDuplicates = new ArrayList();
        int loop_counter = 0;
        for (int j = 0; j < myArray.length; j++) {
            for (int k = j + 1; k < myArray.length; k++) {
                loop_counter++;
                //if (j != k && j < k) 
                {
                    if (myArray[j] == myArray[k]) {
                        myDuplicates.add(myArray[k]);
                    }
                }
            }
        }
        System.out.println(myDuplicates);
        System.out.println(loop_counter);
        return myDuplicates;
    }

    public static void factorial(int n) {                       //Q4
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static int factorialRecursive(int n) {               //Q5
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorialRecursive(n - 1);
            return result;
        }
    }

    public static int fibonacci(int n) {                        //Q6
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static int sumRecursive(int[] myArray, int n) {      //Q7
        if (n == 0) {
            return myArray[n];
        } else {
            return myArray[n] + sumRecursive(myArray, n - 1);
        }
    }

    public static void main(String[] args) {                    //Main Method
        int[] myArray = {2, 3, 2, 0, 5, 3, 2};
        //viewReverse(myArray);
        //getMaxValue(myArray);
        //getDuplicateElements(myArray);
        //factorial(5);
        //System.out.println(factorialRecursive(5));
        //System.out.println(sumRecursive(myArray, myArray.length - 1));
        //System.out.println(fibonacci(8));

    }
}
