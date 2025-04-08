//https://leetcode.com/problems/intersection-of-two-arrays/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int [] result=new int[Math.min(nums1.length, nums2.length)];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int flag=1;
                    for(int h=0;h<k;h++){
                        if(nums1[i]==result[h]){
                            flag=0;
                            break;
                        }
                    }
                    if(flag==1){
                        result[k]=nums1[i];
                        k++;
                    }
                }
            }
        }
        return Arrays.copyOf(result, k);
    }
}
