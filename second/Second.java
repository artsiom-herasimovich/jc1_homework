package jc1_homework.second;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Second {
        public void task12() {
        int multiply = 1;
        int i = 0;
        while (i <= 10) {
            if (i == 0) {
                System.out.println("Factorial 0 = 1");
                i++;
            }
            multiply = multiply * i;
            System.out.println("Factorial " + i + " = " + multiply);
            i++;
        }
    }

    public void task13() {
        var multiply = BigInteger.ONE;
        int i = 1;
        do {
            final var x = BigInteger.valueOf(i);
            multiply = multiply.multiply(x);
            i++;
        } while (i <= 25);
        System.out.println("Factorial = " + multiply);
    }

    public void task14() {
        int num = 10639;
        int sum = 0;
        do {
            sum += (num % 10);
            num /= 10;
        } while (num != 0);
        System.out.println("Сумма цифр равна " + sum);

    }

    public void task15() {

        int num = 0;

        for (int i = 35; i <= 47; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                num++;
            }
            if (num == 2) {
                System.out.println("Второе простое число на промежутке - это " + i);
                break;
            }
        }
    }


    public void task16() {

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Вывожу для числа " + i + " Hope!");
                i++;
            }
        }

    }

    public void task17(int a) {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        DecimalFormat number = new DecimalFormat();
        number.setDecimalFormatSymbols(symbols);
        number.setGroupingSize(3);
        System.out.println(number.format(a));
    }
}
