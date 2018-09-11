public class ex4 {
        public static void viewReverse(int[] myArray) {             //Q1
        System.out.print("Reversed Array: ");
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + ", ");
        }
    }
        
        public static void main(String[] args){
            int myArray[] = {1,2,3,4,5,6,7,8,9};
            viewReverse(myArray);
        }
}
