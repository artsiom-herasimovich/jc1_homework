package jc1_homework.fifth.appliances_t32;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Dishwasher dishwasher = new Dishwasher();
        Luminaire luminaire = new Luminaire();
        on_some(fridge);
        on_some(dishwasher);
        on_some(luminaire);

    }

    public static void on_some(Appliances appliances) {
        appliances.on();
    }

    public static void off_some(Appliances appliances) {
        appliances.off();
    }
}
