package jc1_homework.fifth.factory_t34;

import static jc1_homework.ATM_machine.Account.input;

public class Accountancy {
    public static void startMenu() {

        boolean flag = true;
        if (flag) {
            char answer = 'y';
            while (answer == 'y') {
                System.out.println("Пожалуйста, выберите должность: 1. Директор 2. Мастер 3. Слесарь");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        Hourly_wage.hourly();
                        break;

                    case 2:
                        Mixed_wages.mixed();
                        break;

                    case 3:
                        Percentage_salary.percentage();
                        break;

                    default:
                        System.out.println("Извините, выбранная вами функция неверна!");
                        break;
                }
                System.out.println("Продолжить? Да(y) / Нет(n)");
                answer = input.next().charAt(0);
            }
        }
    }
}
