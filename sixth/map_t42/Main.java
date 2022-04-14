package jc1_homework.sixth.map_t42;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> wordToCount = new TreeMap<>();
        text = text.replaceAll("\\p{Punct}", " ");
        for (String word : text.split(" "))
        {
            wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Кол-во слов в тексте: " + wordToCount);
    }
}
