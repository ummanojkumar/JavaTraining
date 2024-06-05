package external;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyTasks {
    public static void main(String[] args) {
//        reverseWords();
//        openTagCloseTag();

        String[] s = {"{[(]})", "}(}]", "{}([)]",""};
        boolean[] output = new boolean[s.length];
        List<Character> openList = new ArrayList<>();
        List<Character> closeList = new ArrayList<>();


        for (int x = 0; x < s.length; x++) {
            for (int j = 0; j < s[x].length(); j++) {
                if (s[x].charAt(j) == '{' || s[x].charAt(j) == '(' || s[x].charAt(j) == '[') {
                    openList.add(s[x].charAt(j));
                } else if (s[x].charAt(j) == '}' || s[x].charAt(j) == ')' || s[x].charAt(j) == ']') {
                    closeList.add(s[x].charAt(j));
                }
            }
            int count = 0;
            if (openList.size() == closeList.size()) {
                for (int y = 0; y < openList.size(); y++) {
                    if (openList.get(y) == '{' && closeList.get(y) == '}') {
                        count++;
                    } else if (openList.get(y) == '[' && closeList.get(y) == ']') {
                        count++;
                    } else if (openList.get(y) == '(' && closeList.get(y) == ')') {
                        count++;
                    }
                }
                if (count == openList.size()) {
                    output[x] = true;
                } else {
                    output[x] = false;
                }
            } else {
                output[x] = false;
            }

            System.out.println(openList);
            System.out.println(closeList);
            openList.clear();
            closeList.clear();

        }


        System.out.println(Arrays.toString(output));
    }

    private static void openTagCloseTag() {
        String[] s = {"{[(]})", "}(}]", "{}([)]"};
        boolean[] output = new boolean[s.length];

        for (int x = 0; x < s.length; x++) {
            int openCount = 0;
            int closeCount = 0;
            for (int j = 0; j < s[x].length(); j++) {
                if (s[x].charAt(j) == '{' || s[x].charAt(j) == '(' || s[x].charAt(j) == '[') {
                    openCount++;
                } else if (s[x].charAt(j) == '}' || s[x].charAt(j) == ')' || s[x].charAt(j) == ']') {
                    closeCount++;
                }
            }
            output[x] = (openCount == closeCount);
        }

        System.out.println(Arrays.toString(output));
    }

    private static void reverseWords() {
        String s = "i  my world";
        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
        for (int x = array.length - 1; x > -1; x--) {
            System.out.print(array[x] + " ");
        }
    }
}
