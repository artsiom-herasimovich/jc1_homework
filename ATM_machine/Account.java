package jc1_homework.ATM_machine;

import java.util.Scanner;

public class Account {

    public static Scanner input = new Scanner(System.in);

    static int balance = 1000;
    static int pwd = 1111; // пароль
    static boolean flag = true; // объявляем логическую переменную

    public static void user() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Пожалуйста, введите ваш пароль:");
            int inputPwd = input.nextInt();

            if (inputPwd == pwd) {
                flag = true;
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Извините, пароль неверный, у вас все еще есть»" + (3 - i) + "Второй шанс!");
                } else {
                    System.out.println("Извините, ваша карта заблокирована!");
                    break;
                }
                flag = false;
            }
        }
    }

    public int showBalance(){
        return balance;
    }
}
