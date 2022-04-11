package jc1_homework.fifth.season_t36;

import java.util.Scanner;

public enum Season_next {
    Summer("Hot", 92), Autumn("Chilly", 91), Winter("Cold", 90), Spring("Warm", 92);

    private String description;
    private int countOfDays;

    Season_next (String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void nextSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valid season: ");
        String newSeason = scanner.nextLine();
        switch (newSeason) {
            case "Summer":
                System.out.println("Next season is " + Autumn.name());
                break;
            case "Autumn":
                System.out.println("Next season is " + Winter.name());
                break;
            case "Winter":
                System.out.println("Next season is " + Spring.name());
                break;
            case "Spring":
                System.out.println("Next season is " + Summer.name());
                break;
            default:
                System.out.println("Enter valid season");
        }
    }
}
