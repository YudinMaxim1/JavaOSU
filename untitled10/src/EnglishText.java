//Задание № 6

import java.util.*;
import java.io.*;

public class EnglishText {

    public static void main(String[] args) throws FileNotFoundException {
        Set<String> uniqWords = new HashSet<>();

        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String str;
            while((str = reader.readLine())!= null){
                String[] words = str.split("[^a-zA-Z0-9]+");
                for(String word: words){
                    uniqWords.add(word.toUpperCase());
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(uniqWords);
    }
}
