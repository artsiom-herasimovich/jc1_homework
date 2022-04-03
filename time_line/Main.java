package jc1_homework.time_line;

public class Main {

    public static void main(String[] args){
        System.out.println("********** task24: **********");
        Timeline firstGapTime = new Timeline(154432);
        System.out.println(firstGapTime.getTime());
        Timeline secondGapTime = new Timeline(12,25,34);
        System.out.println(secondGapTime.getTime());
        System.out.println(secondGapTime.getSecGap());
        System.out.println(firstGapTime.compareTo(secondGapTime));
    }
}
