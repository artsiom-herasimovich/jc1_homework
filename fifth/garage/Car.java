package jc1_homework.fifth.garage;

public class Car extends Vehicle {
    static String name = "Car";

    public Car(String name) {
        super(name);
    }

    public static String getNameC(){
        System.out.println(name);
        return null;
    }
}
