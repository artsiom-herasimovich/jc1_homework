package jc1_homework.fifth.factory_t34;

import java.util.Scanner;

public class Percentage_salary extends Accountancy{

    public static void percentage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите общую прибыль от рабочего");
        int fullMoney = scanner.nextInt();
        int percent = Plumber.plu;

        System.out.println("Заработная плата равна " + (fullMoney * percent)/100);
    }
}
