package jc1_homework;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.math.*;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class First {
    public void task3() {
        byte b = 0x55;
        short s = 0x55FF;
        int i = 1_000_000;
        long l = 0xFFFFFFFFL;
        char c = 'a';
        float f = .25F;
        double d = .00001234;
        boolean bool = true;

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("bool = " + bool);
    }

    public int task4(int a, int b) {
        int sum = a + b;
        int multiply = a * b;
        return sum + multiply;
    }

    public void task5() {
        long sec = 543_000;
        double min = sec / 60;
        double hour = sec / (60 * 60);
        double day = sec / (60 * 60 * 24);
        double week = sec / (60 * 60 * 24 * 7);

        System.out.println(sec + " секунд");
        System.out.println(min + " минут");
        System.out.println(hour + " часов");
        System.out.println(day + " дней,");
        System.out.println(week + " недель");
    }

    public boolean task6(int i) {
        int v = i % 10;
        return (v == 7);
    }

    public void task7(int a, int b, int r) {
        double d = Math.sqrt((double) (a * a) + (double) (b * b));

        if (2 * r >= d) {
            System.out.println("Перекрывает");
            return;
        }

        System.out.println("Не перекрывает");
    }

    public void task8(int a) {
        int last = a % 10;
        int penUltimate = (a % 100) / 10;

        if (penUltimate == 1)
            System.out.println(a + " рублей");
        else if (last == 1)
            System.out.println(a + " рубль");
        else if ((last == 2) || (last == 3) || (last == 4))
            System.out.println(a + " рубля");
        else if ((last == 0) || (last >= 5))
            System.out.println(a + " рублей");
    }

    public void task9(int d, int m, int y) {

        Calendar cal = new GregorianCalendar(y, (m - 1), d);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        int nd = d + 1;
        int nm = m;
        int ny = y;

        if (nd > maxDay) {
            nd = nd - maxDay;
            nm = nm + 1;
            if (nm > 12) {
                nm = nm - 12;
                ny = ny + 1;
            }
        }

        System.out.println(nd + "." + nm + "." + ny);
    }

    public void task10(int a, int b, int c, int d, int e, int f){
        int i = 0;

        if((a+c)<=e) {
            if((b <= f)&&(d <= f)){
                i++;
            }
        }

        else if((a+c)<=f) {
            if((b <= e)&&(d <= e)){
                i++;
            }
        }

        if((b+c)<=e) {
            if((a <= f)&&(d <= f)){
                i++;
            }
        }

        else if((b+c)<=f) {
            if((a <= e)&&(d <= e)){
                i++;
            }
        }

        if((a+d)<=e) {
            if((b <= f)&&(c <= f)){
                i++;
            }
        }

        else if((a+d)<=f) {
            if((b <= e)&&(c <= e)){
                i++;
            }
        }

        if((b+d)<=e) {
            if((a <= f)&&(c <= f)){
                i++;
            }
        }

        else if((b+d)<=f) {
            if((a <= e)&&(c <= e)){
                i++;
            }
        }

        if(i > 0)
            System.out.println("Дома помещаются");
        else
            System.out.println("Дома не помещаются");
    }

    public void task11(int a) {
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                System.out.println("Отрицать");
                break;

            case 2:
                System.out.println("Вторник");
                System.out.println("Злиться");
                break;

            case 3:
                System.out.println("Среда");
                System.out.println("Торговаться");
                break;

            case 4:
                System.out.println("Четверг");
                System.out.println("Унывать");
                break;

            case 5:
                System.out.println("Пятница");
                System.out.println("Принимать");
                break;

            case 6:
                System.out.println("Суббота");
                System.out.println("Покупать билеты в Польшу");
                break;

            case 0:
                System.out.println("Воскресенье");
                System.out.println("Погрузиться в состояние шока");
                break;

            default:
                System.out.println("Введи число от 1 до 7");
                break;
        }
    }

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
            num/=10;
        } while(num != 0);
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

    public void task18() {
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("["+i+"]"+(i+1) + " элемент массива " + marks[i]);
        }

        int lastElem = marks[marks.length - 1];
        System.out.println("Последний элемент массива " + lastElem);
    }

    public void task19() {
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("["+i+"]"+(i+1) + " элемент массива " + marks[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Элемент массива на " + i + " позиции индекса = " + marks[i]);
            }
        }

    }

    public void task20() {
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("["+i+"]"+(i+1) + " элемент массива " + marks[i]);
        }
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        System.out.println("Максимальное значение " + maxMark);

        for (int i = 0; i < 10; i++) {
            if (marks[i] == maxMark) {
                System.out.println("Индекс максимального элелемента " + i);
            }
        }
    }

//    public void task21() {
//        int marks[] = new int[10];
//        for (int i = 0; i < 10; i++) {
//            marks[i] = (int) (Math.random() * 10 + 1);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("["+i+"]"+(i+1) + " элемент массива " + marks[i]);
//        }
//
//        int minMark = marks[0];
//        for (int i = 0; i < marks.length; i++) {
//            if(minMark > marks[i]) {
//                minMark = marks[i];
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (marks[i] == minMark) {
//                System.out.println("Индекс минимального элелемента " + i);
//            }
//        }
//
//        int maxMark = marks[0];
//        for (int i = 0; i < marks.length; i++) {
//            if(maxMark < marks[i]) {
//                maxMark = marks[i];
//            }
//        }
//
//        for (int i = 0; i < 10; i++) {
//            if (marks[i] == maxMark) {
//                System.out.println("Индекс максимального элелемента " + i);
//            }
//        }
//
//        int sum = 0;
//        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] == minMark) {
//                sum = marks[i] + marks[i + 1];
//                i++;
//            }
//        }
//        System.out.println("Сумма элементов " + sum);
//    }


    public void task23() {
        int[][] myArray = new int[5][5];

        myArray[0][0] = 1;
        myArray[0][1] = 1;
        myArray[0][2] = 1;
        myArray[0][3] = 1;
        myArray[0][4] = 1;
        myArray[1][0] = 0;
        myArray[1][1] = 1;
        myArray[1][2] = 1;
        myArray[1][3] = 1;
        myArray[1][4] = 0;
        myArray[2][0] = 0;
        myArray[2][1] = 0;
        myArray[2][2] = 1;
        myArray[2][3] = 0;
        myArray[2][4] = 0;
        myArray[3][0] = 0;
        myArray[3][1] = 1;
        myArray[3][2] = 1;
        myArray[3][3] = 1;
        myArray[3][4] = 0;
        myArray[4][0] = 1;
        myArray[4][1] = 1;
        myArray[4][2] = 1;
        myArray[4][3] = 1;
        myArray[4][4] = 1;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}


