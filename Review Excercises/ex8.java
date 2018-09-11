
public class ex8 {

    public static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n * factorialRecursive(n - 1);
            return result;
        }
    }
    
    public static void main(String[] args){
        System.out.println(factorialRecursive(3));
    }
}
