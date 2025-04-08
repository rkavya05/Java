//https://www.geeksforgeeks.org/problems/rotation4723/1
public class Main{
    public static int kthRotation(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (a[mid] > a[j]) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = {5,1,2,3,4};
        int Rotated = kthRotation(a);
        System.out.println("kthRotation : " + Rotated);
    }
}
