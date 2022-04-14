package jc1_homework.sixth.mark_list_t40;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < element; i++)
        {
            array.add(i, (int)(Math.random() * 10 + 1));
        }
        System.out.println("Все числа: " + array);
        Set <Integer > set = new LinkedHashSet <>(array);
        List < Integer > arrayWithoutDups = new ArrayList <>( set );
        System.out.println("Только неповторяющиеся числа: " + arrayWithoutDups);

    }
}
