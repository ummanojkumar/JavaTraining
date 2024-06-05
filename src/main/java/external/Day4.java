package external;

import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {

//        System.out.println(squareRoot(8));
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        for(int x=m; x<m+n; x++) {
            if(i<n) {
                nums1[x] = nums2[i];
                i++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
    public static int squareRoot(int n) {
        return (int) Math.floor(Math.sqrt(n));
    }
}
