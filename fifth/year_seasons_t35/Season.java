package jc1_homework.fifth.year_seasons_t35;

public enum Season {
        Summer("Hot", 92), Autumn("Chilly", 91), Winter("Cold", 90), Spring("Warm", 92);

    private String description;
    private int countOfDays;

    Season (String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
