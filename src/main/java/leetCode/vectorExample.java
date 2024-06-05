package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class vectorExample {

    public static int searchInsert(int[] nums, int target) {
        List<Integer> intList = new ArrayList<>();
        for(int a: nums) {
            intList.add(a);
        }
        int index= intList.indexOf(target);
        if (index== -1) {
            intList.add(target);
            Collections.sort(intList);
            index = intList.indexOf(target);
        }

        return index;
    }
    public static void main(String[] args) {
       int[] nums ={1,3,5,6};
       int target = 2;
        System.out.println( searchInsert(nums, target));
    }
}
