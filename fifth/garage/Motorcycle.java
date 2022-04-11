package jc1_homework.fifth.garage;

public class Motorcycle extends Vehicle {
    static String name = "Motorcycle";

    public Motorcycle(String name) {
        super(name);
    }

    public static String getNameM() {
        System.out.println(name);
        return null;
    }
}
