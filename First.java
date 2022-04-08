package jc1_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
//    public void task3() {
//        byte b = 0x55;
//        short s = 0x55FF;
//        int i = 1_000_000;
//        long l = 0xFFFFFFFFL;
//        char c = 'a';
//        float f = .25F;
//        double d = .00001234;
//        boolean bool = true;
//
//        System.out.println("b = " + b);
//        System.out.println("s = " + s);
//        System.out.println("i = " + i);
//        System.out.println("l = " + l);
//        System.out.println("c = " + c);
//        System.out.println("f = " + f);
//        System.out.println("d = " + d);
//        System.out.println("bool = " + bool);
//    }
//
//    public int task4(int a, int b) {
//        int sum = a + b;
//        int multiply = a * b;
//        return sum + multiply;
//    }
//
//    public void task5() {
//        long sec = 543_000;
//        double min = sec / 60;
//        double hour = sec / (60 * 60);
//        double day = sec / (60 * 60 * 24);
//        double week = sec / (60 * 60 * 24 * 7);
//
//        System.out.println(sec + " секунд");
//        System.out.println(min + " минут");
//        System.out.println(hour + " часов");
//        System.out.println(day + " дней,");
//        System.out.println(week + " недель");
//    }
//
//    public boolean task6(int i) {
//        int v = i % 10;
//        return (v == 7);
//    }
//
//    public void task7(int a, int b, int r) {
//        double d = Math.sqrt((double) (a * a) + (double) (b * b));
//
//        if (2 * r >= d) {
//            System.out.println("Перекрывает");
//            return;
//        }
//
//        System.out.println("Не перекрывает");
//    }
//
//    public void task8(int a) {
//        int last = a % 10;
//        int penUltimate = (a % 100) / 10;
//
//        if (penUltimate == 1)
//            System.out.println(a + " рублей");
//        else if (last == 1)
//            System.out.println(a + " рубль");
//        else if ((last == 2) || (last == 3) || (last == 4))
//            System.out.println(a + " рубля");
//        else if ((last == 0) || (last >= 5))
//            System.out.println(a + " рублей");
//    }
//
//    public void task9(int d, int m, int y) {
//
//        Calendar cal = new GregorianCalendar(y, (m - 1), d);
//        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//
//        int nd = d + 1;
//        int nm = m;
//        int ny = y;
//
//        if (nd > maxDay) {
//            nd = nd - maxDay;
//            nm = nm + 1;
//            if (nm > 12) {
//                nm = nm - 12;
//                ny = ny + 1;
//            }
//        }
//
//        System.out.println(nd + "." + nm + "." + ny);
//    }
//
//    public void task10(int a, int b, int c, int d, int e, int f) {
//        int i = 0;
//
//        if ((a + c) <= e) {
//            if ((b <= f) && (d <= f)) {
//                i++;
//            }
//        } else if ((a + c) <= f) {
//            if ((b <= e) && (d <= e)) {
//                i++;
//            }
//        }
//
//        if ((b + c) <= e) {
//            if ((a <= f) && (d <= f)) {
//                i++;
//            }
//        } else if ((b + c) <= f) {
//            if ((a <= e) && (d <= e)) {
//                i++;
//            }
//        }
//
//        if ((a + d) <= e) {
//            if ((b <= f) && (c <= f)) {
//                i++;
//            }
//        } else if ((a + d) <= f) {
//            if ((b <= e) && (c <= e)) {
//                i++;
//            }
//        }
//
//        if ((b + d) <= e) {
//            if ((a <= f) && (c <= f)) {
//                i++;
//            }
//        } else if ((b + d) <= f) {
//            if ((a <= e) && (c <= e)) {
//                i++;
//            }
//        }
//
//        if (i > 0)
//            System.out.println("Дома помещаются");
//        else
//            System.out.println("Дома не помещаются");
//    }
//
//    public void task11(int a) {
//        switch (a) {
//            case 1:
//                System.out.println("Понедельник");
//                System.out.println("Отрицать");
//                break;
//
//            case 2:
//                System.out.println("Вторник");
//                System.out.println("Злиться");
//                break;
//
//            case 3:
//                System.out.println("Среда");
//                System.out.println("Торговаться");
//                break;
//
//            case 4:
//                System.out.println("Четверг");
//                System.out.println("Унывать");
//                break;
//
//            case 5:
//                System.out.println("Пятница");
//                System.out.println("Принимать");
//                break;
//
//            case 6:
//                System.out.println("Суббота");
//                System.out.println("Покупать билеты в Польшу");
//                break;
//
//            case 0:
//                System.out.println("Воскресенье");
//                System.out.println("Погрузиться в состояние шока");
//                break;
//
//            default:
//                System.out.println("Введи число от 1 до 7");
//                break;
//        }
//    }
//




    public void task26() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();

        Pattern symbol = Pattern.compile("[\\p{P}\\p{S}]");
        Matcher matcherSymbol = symbol.matcher(s);
        List<String> chara = new ArrayList<>();

        while (matcherSymbol.find()) {
            chara.add(matcherSymbol.group(0));
        }
        System.out.println("Кол-во знаков препинания: " + Integer.toString(chara.size()));
    }

    public void task27() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();
        int n = 0;

        String[] words = s.split("[\\s]");
        for (String word : words) {
            n++;
            System.out.println(word);
        }
        System.out.println(n);
    }

    public void task28() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();
        int n = 0;

        String[] words = s.split("[\\s]");
        for (String word : words) {
            n++;
            System.out.print(word.substring(word.length() - 1));
        }
    }

    public void task29() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();

        Pattern symbol = Pattern.compile("[0x\\p{XDigit}+]");
        Matcher matcherSymbol = symbol.matcher(s);

        while (matcherSymbol.find()) {
            System.out.println(matcherSymbol.group());
        }
        System.out.println(matcherSymbol.group());

    }

}



