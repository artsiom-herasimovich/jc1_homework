package jc1_homework.fifth.factory_t34;

import java.util.Scanner;

public class Hourly_wage extends Accountancy {
    public static void hourly() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во отработанных часов рабочего");
        int hours = scanner.nextInt();
        int rate = Director.dir;

        System.out.println("Заработная плата равна " + hours * rate);
    }
}
