//Outpput: 6
public class Main {
    public static int countDigit(int n) {
        if (n == 0) {
            return 0; // Base case
        }else{
            return 1 + countDigit(n/10);
        }

    }
    public static void main(String[] args) {
        System.out.println("Number of zeros: " + countDigit(353445));
    }
}
