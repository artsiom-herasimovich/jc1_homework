package jc1_homework.fifth.factory_t34;

import java.util.Scanner;


public class Mixed_wages extends Accountancy {

    public static void mixed() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во отработанных часов рабочего");
        int hours_m = scanner.nextInt();
        int rate_m = Master.mix_rate;
        System.out.println("Введите общую прибыль от рабочего");
        int fullMoney_m = scanner.nextInt();
        int percent_m = Master.mix_percent;

        System.out.println("Заработная плата равна " + (((fullMoney_m * percent_m)/100) + (hours_m * rate_m)));
    }
}
