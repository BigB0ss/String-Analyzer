package main.java.com.romanov.analyzer;

/**
 * Created by batman on 06.02.2017.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Класс анализатор строк
 */
public class StringAnalyzer {
    public static List<String> stringBreaker(String splitString, String delimiter) {

        List<String> splitedStrings = new ArrayList<>();
        splitString += " ";
        int begin = 0;
        String currentString;
        for (int i = 0; i < splitString.length(); i++) {
            for (int j = 0; j < delimiter.length(); j++) {
                if (splitString.charAt(i) == delimiter.charAt(j)) {
                    currentString = splitString.substring(begin, i);
                    if (!currentString.equals("") && !currentString.equals(" ")) {
                        splitedStrings.add(currentString);
                    }
                    if (!Character.toString(splitString.charAt(i)).equals(" ")) {
                        splitedStrings.add(Character.toString(splitString.charAt(i)));
                    }
                    System.out.println("split character: " + splitString.charAt(i));
                    begin = i+1;
                }
            }
        }

        return splitedStrings;
    }

    public static void printListOfString(List<String> list) {
        list.stream().forEach(elem -> System.out.println(elem));
    }
}
