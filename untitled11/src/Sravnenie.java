//Задание №1 вариант 5

import java.util.*;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sravnenie implements Comparator<String> {

    private int getSumOfNumbers(String str) {
        int sum = 0;
        Pattern p = Pattern.compile("//d+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        return sum;
    }

    @Override
    public int compare(String str1, String str2) {
        int sum1 = getSumOfNumbers(str1);
        int sum2 = getSumOfNumbers(str2);
        return Integer.compare(sum1, sum2);
    }


    public static void main(String[] args){
        Comparator<String> comparator = new Sravnenie();
        System.out.println(comparator.compare("a1bc4", "x4y5z6"));

    }
}
