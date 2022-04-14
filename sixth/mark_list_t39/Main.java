package jc1_homework.sixth.mark_list_t39;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int element = 10;
        int negative = 4;
        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < element; i++)
        {
            mark.add(i, (int)(Math.random() * 10 + 1));
        }
        System.out.println("Все оценки: " + mark);
        mark.removeIf(score -> score <= negative);
        System.out.println("Только удовлетворительные оценки: " + mark);
    }
}
