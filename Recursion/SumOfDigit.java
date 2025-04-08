//Input: 342
//Output: 9
public class Main {
    public static int SumOfDigit(int n) {
        if (n == 0) {
            return 0; // Base case
        }else{
            return(n%10) + SumOfDigit(n/10);
        }

    }
    public static void main(String[] args) {
        System.out.println("Number of Digits: " + SumOfDigit(342));
    }
}
