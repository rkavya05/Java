//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1

public class RotatedArray{
    public static int minElement(int[] a, int n) {
        int l = 0, h = n - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (a[mid] > a[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return a[l];
    }

    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int min = minElement(a, a.length);
        System.out.println("MinElement : " + min);
    }
}
