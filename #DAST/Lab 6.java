
public class SelectionSort {

    public static void swap(int myArray[], int index1, int index2) {
        int num1 = myArray[index1];
        int num2 = myArray[index2];

        myArray[index1] = num2;
        myArray[index2] = num1;
    }

    public static void viewArray(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }

    public static void sortLoop(int myArray[]) {
        int swapCount = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int n = (i + 1); n < myArray.length; n++) {
                if (myArray[n] < myArray[i]) {
                    swap(myArray, n, i);
                    swapCount++;
                }
            }
            swapCount++;
        }
        System.out.println(swapCount);
    }

    public static void sort(int myArray[]) {
        int swapCount = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[iMin]) {
                    iMin = j;
                }
            }
            if (iMin != i) {
                swap(myArray, i, iMin);
                swapCount++;
            }
        }
        System.out.println(swapCount);
    }
    
    public static void main(String[] args) {
        int[] myArray = {2, 3, 1, 4, 6, 0, 8, 2, 9};
        sort(myArray);
        viewArray(myArray);
    }
}
