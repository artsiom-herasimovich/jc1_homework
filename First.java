package jc1_homework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class First {
    public void task3(){
        byte b = 0x55;
        short s = 0x55FF;
        int i = 1_000_000;
        long l = 0xFFFFFFFFL;
        char c = 'a';
        float f = .25F;
        double d = .00001234;
        boolean bool = true;

        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("c = "+c);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("bool = "+bool);
    }

    public int task4(int a, int b){
        int c = a+b;
        int d = a*b;
        return c+d;
    }

    public void task5(){
        long sec = 543_000;
        long min = sec/60;
        long hour = sec/(60*60);
        long day = sec/(60*60*24);
        long week = sec/(60*60*24*7);

        System.out.println(sec+ "секунд");
        System.out.println(min + " минут");
        System.out.println(hour + " часов");
        System.out.println(day + " дней,");
        System.out.println(week + " недель");
    }

    public boolean task6(int i){
        int v = i%10;
        return (v == 7);
    }

    public void task7(int a, int b, int r){
        double d = Math.sqrt((double)(a*a) + (double)(b*b));

        if(2*r >= d) {
            System.out.println("Перекрывает");
            return;
        }

        System.out.println("Не перекрывает");
    }

    public void task8(int a){
        int b = a%10;
        int c = (a%100)/10;

        if(c == 1)
            System.out.println(a + " рублей");
        else if(b == 1)
            System.out.println(a + " рубль");
        else if ((b == 2)||(b == 3)||(b == 4))
            System.out.println(a + " рубля");
        else if ((b == 0)||(b >= 5))
            System.out.println(a + " рублей");
    }

    public void task9(int d, int m, int y){

        Calendar cal = new GregorianCalendar(y, (m-1), d);
        int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        int nd = d + 1;
        int nm = m;
        int ny = y;

        if(nd > maxDay) {
            nd = nd - maxDay;
            nm = nm + 1;
            if(nm > 12) {
                nm = nm - 12;
                ny = ny + 1;
            }
        }

        System.out.println(nd + "." + nm + "." + ny);
    }

    public void task11(int a){
        switch (a){
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
        int i = 1;
        while (i <= 10) {
            multiply = multiply* (multiply+1);
            i++;
        }
    }

}