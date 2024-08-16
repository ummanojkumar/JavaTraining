package cheatShett.EfficientCode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EfficientCodeExample {

    //for loop in java 8
    public static String reverseAstring(String input) {
        return IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static void getCharacters(String value) {
        Matcher numberPattern = Pattern.compile("\\d+").matcher(value);
        Matcher stringPattern = Pattern.compile("\\D+").matcher(value);

        List<String> characterList = new ArrayList<>();
        while (stringPattern.find()) {
            characterList.add(stringPattern.group());
        }

        int i=0;
        while (numberPattern.find()) {

            System.out.println( characterList.get(i).repeat(Integer.parseInt(numberPattern.group())));
            i++;
        }
    }
}
