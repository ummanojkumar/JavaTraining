package external;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(removeDuplicates(nums));
//
//        int[] num2 = {0, 1, 2, 2, 3, 0, 4, 2};
//        System.out.println(removeElement(num2, 2));

//        System.out.println(strStr("sadbutsad", "sad"));
//        System.out.println(lengthOfLastWord("Hello World"));
        int[] k= {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println("size "+k.length);
        System.out.println(Arrays.toString(plusOne(k)));
    }


    public static int[] plusOne(int[] digits) {

        String s = "";
        for (int x = 0; x < digits.length; x++) {
            s = s + digits[x];
        }
        BigInteger big= new BigInteger(s).add(BigInteger.valueOf(1));
        return big.toString().chars().map(Character::getNumericValue).toArray();
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }

    //leetCode = 28
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] != val) {
                nums[i] = nums[x];
                i++;
            }
        }
        return i;
    }

    public static int removeDuplicates(int[] nums) {
        //convert int to array
        TreeSet<Integer> list = new TreeSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
//        TreeSet<Integer> list2 = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        int x = 0;
        for (Integer list3 : list) {
            nums[x] = list3;
            x++;
        }

        return x;
    }

}
