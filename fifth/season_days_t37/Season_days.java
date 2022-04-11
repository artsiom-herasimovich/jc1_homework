package jc1_homework.fifth.season_days_t37;

import java.util.Scanner;

public enum Season_days {
    Summer("Hot", 92), Autumn("Chilly", 91), Winter("Cold", 90), Spring("Warm", 92);

    private String description;
    private int countOfDays;

    Season_days (String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void daysBySeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valid season: ");
        String newSeason = scanner.nextLine();
        switch (newSeason) {
            case "Summer":
                System.out.println("Days in summer: " + Summer.getCountOfDays());
                break;
            case "Autumn":
                System.out.println("Days in autumn: " + Autumn.getCountOfDays());
                break;
            case "Winter":
                System.out.println("Days in winter: " + Winter.getCountOfDays());
                break;
            case "Spring":
                System.out.println("Days in Spring: " + Spring.getCountOfDays());
                break;
            default:
                System.out.println("Enter valid season");
        }
    }
}