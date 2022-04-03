package jc1_homework.third;

public class Third {
    public void task18() {
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]" + (i + 1) + " элемент массива " + marks[i]);
        }

        int lastElem = marks[marks.length - 1];
        System.out.println("Последний элемент массива " + lastElem);
    }

    public void task19() {
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]" + (i + 1) + " элемент массива " + marks[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Элемент массива на " + i + " позиции индекса = " + marks[i]);
            }
        }

    }

    public void task20() {
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]" + (i + 1) + " элемент массива " + marks[i]);
        }
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (maxMark < marks[i]) {
                maxMark = marks[i];
            }
        }
        System.out.println("Максимальное значение " + maxMark);

        for (int i = 0; i < 10; i++) {
            if (marks[i] == maxMark) {
                System.out.println("Индекс максимального элелемента " + i);
            }
        }
    }

    public void task21() {
        int a = 0;
        int size = 10;
        int marks [] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < marks.length; i++){
            marks[i]= (int) ((Math.random() * 110) - 50 );
        }
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < marks.length; i++){
            if (marks[i] > max){
                max = marks[i];
                indexMax = i;
            }
            if (marks[i] < min){
                min = marks[i];
                indexMin = i;
            }
        }
        System.out.println(min + " " + max);

        if (indexMin < indexMax) {
            for(int i = indexMin + 1; i < indexMax; i++)
                a += marks[i];
        } else{
            for(int i = indexMax + 1; i < indexMin; i++)
                a += marks[i];
        }

        System.out.println(a);
    }


    public void task22() {

        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "]" + (i + 1) + " элемент массива " + marks[i]);
        }

        System.out.println("Элементы в обратном порядке");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);

        }
    }

    public void task23() {
        int[][] myArray = new int[5][5];

        myArray[0][0] = 1;
        myArray[0][1] = 1;
        myArray[0][2] = 1;
        myArray[0][3] = 1;
        myArray[0][4] = 1;
        myArray[1][0] = 0;
        myArray[1][1] = 1;
        myArray[1][2] = 1;
        myArray[1][3] = 1;
        myArray[1][4] = 0;
        myArray[2][0] = 0;
        myArray[2][1] = 0;
        myArray[2][2] = 1;
        myArray[2][3] = 0;
        myArray[2][4] = 0;
        myArray[3][0] = 0;
        myArray[3][1] = 1;
        myArray[3][2] = 1;
        myArray[3][3] = 1;
        myArray[3][4] = 0;
        myArray[4][0] = 1;
        myArray[4][1] = 1;
        myArray[4][2] = 1;
        myArray[4][3] = 1;
        myArray[4][4] = 1;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
