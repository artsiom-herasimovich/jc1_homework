package jc1_homework.sixth.maxmark_list_t41;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < element; i++) {
            array.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println("Все числа: " + array);
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            int maxMark = array.get(0);

            for (int i = 0; i < element; i++) {
                if (maxMark < array.get(i)) {
                    maxMark = array.get(i);
                }
            }
            System.out.println("Самая высокая оценка: " + maxMark);
            break;
        }

    }
}
