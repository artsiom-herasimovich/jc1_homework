package jc1_homework.fifth.year_seasons_t35;

public class Main {
    public static void main(String[] args) {

        Season summer = Season.Summer;
        System.out.println(summer.name());
        System.out.println(summer.getDescription());
        System.out.println(summer.getCountOfDays());
        System.out.println("---------------------");

        Season autumn = Season.Autumn;
        System.out.println(autumn.name());
        System.out.println(autumn.getDescription());
        System.out.println(autumn.getCountOfDays());
        System.out.println("---------------------");

        Season winter = Season.Winter;
        System.out.println(winter.name());
        System.out.println(winter.getDescription());
        System.out.println(winter.getCountOfDays());
        System.out.println("---------------------");

        Season spring = Season.Spring;
        System.out.println(spring.name());
        System.out.println(spring.getDescription());
        System.out.println(spring.getCountOfDays());
    }
}
