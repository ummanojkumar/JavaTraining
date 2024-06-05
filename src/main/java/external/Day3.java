package external;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;

public class Day3 {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
//        int[] list = {1,1,2,2,3,7,8,8,4,5,3,4,5};  //7
//        System.out.println(findNonOccurrence(list));
    }

    public static String addBinary(String a, String b) {
        int alen= a.length();
        int blen= b.length();
//        if (a.length() > b.length()) {
//            b = String.format("%s", b);
//        }
        String numberString = "42";

        // Format the string as a zero-padded string with a width of 6 characters
        String paddedNumber = String.format("%06s", numberString);
        System.out.println("Padded number: " + paddedNumber);
        return null;
    }

    public static int findNonOccurrence(int[] list) {
        int result = 0;
        for (int i : list) {
            result ^= i;
        }
        return result;

    }

}
