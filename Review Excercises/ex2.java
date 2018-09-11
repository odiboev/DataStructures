
public class ex2 {

    public static int getMaxMinValue(int[] myArray) {              //Q2
        int maxValue = myArray[0];
        for (int m = 0, n = 1; n < myArray.length; m++, n++) {
            if (myArray[m] > maxValue) {
                maxValue = myArray[m];
            } else if (myArray[n] > maxValue) {
                maxValue = myArray[n];
            }
        }
        int minValue = myArray[0];
        for (int m = 0, n = 1; n < myArray.length; m++, n++) {
            if (myArray[m] < minValue) {
                minValue = myArray[m];
            } else if (myArray[n] < minValue) {
                minValue = myArray[n];
            }
        }
        System.out.println("\nMaximum Value: " + maxValue);
        System.out.println("\nMinimum Value: " + minValue);
        return maxValue;
    }

    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        getMaxMinValue(myArray);
    }
}
