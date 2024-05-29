//Задание №2 вариант 5

import java.util.*;
import java.lang.*;

public class WordsInString {
    public static void main(String[] args){
        List<String> str = Arrays.asList("apple", "ant", "comparator", "computer", "mouse");
        char startChar = 'a';
        long count = str.stream()
                .filter(sl -> sl.charAt(0) == startChar)
                .count();
        System.out.println("Found char: " + startChar + "; count: " + count);
    }

}
