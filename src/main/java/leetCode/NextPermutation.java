package leetCode;

import java.util.*;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int a : nums) {
            list.add(a);
        }
        List<Integer> sublist = new ArrayList<>(list.subList(1,list.size()));

        sublist.sort(Comparator.reverseOrder());
        if (sublist.equals(list.subList(1,list.size()))) {
            Collections.sort(list);
            System.out.println(list);
        }
        sublist.add(0, list.get(0));
//        nums=sublist.toArray();
        System.out.println("outside"+sublist);
    }
    public static void main(String[] args) {
      int[]  nums = {1,2,3};
      new NextPermutation().nextPermutation(nums);
    }

}
