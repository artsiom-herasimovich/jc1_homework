package jc1_homework.ATM_machine;

import java.util.Scanner;

import static jc1_homework.ATM_machine.Account.balance;
import static jc1_homework.ATM_machine.Account.input;
import static jc1_homework.ATM_machine.Storage.banknotes;

public class UserDisplay {

    static boolean flag = Account.flag;

    public static void startMenu() {

    if(flag) {
        char answer = 'y';
        while (answer == 'y') {
            System.out.println("Пожалуйста, выберите функцию: 1. Вывод средств 2. Пополнение счета 3. Проверка баланса  4. Выход");
            int choice = input.nextInt();
            switch (choice) {
                case 1:

                    print(Storage.getBanknotes());
                    promptSelectBanknotes();
                    int banknotesNumber = readBanknotesNumber();
                    System.out.println("Пожалуйста заберите деньги");
                    break;
                case 2:

                    System.out.println("---> Депозит");
                    System.out.println("Пожалуйста, расположите банкноты и поместите их в депозитный порт:");
                    double saveMoney = input.nextDouble();
                    if (saveMoney > 0 && saveMoney <= 2500) {
                        if (saveMoney % 20 == 0 || saveMoney % 50 == 0) {
                            balance += saveMoney;
                            System.out.println("Депозит успешен! Баланс BYN " + balance);
                        }
                    } else if (saveMoney > 2500) {
                        System.out.println("Внесите депозит до 2500 BYN за раз, пожалуйста, внесите депозит партиями!");
                    } else {
                        System.out.println("Депонированная банкнота является поддельной банкнотой, и она недействительна и конфискована!");
                    }
                    break;
                case 3:

                    System.out.println("---> Проверить баланс");
                    System.out.println("Баланс на вашей карте:" + balance + "BYN");
                    break;

                case 4:

                    System.out.println("Спасибо за ваше использование!");
                    break;
                default:
                    System.out.println("Извините, выбранная вами функция неверна!");
                    break;
            }
            System.out.println("Продолжить? Да(y) / Нет(n)");
            answer = input.next().charAt(0);

        }
        System.out.println("Спасибо за ваше использование!");

    }

}

    public static void print(Banknotes[] banknotes) {
        for (int banknotesNumber = 1; banknotesNumber <= banknotes.length; banknotesNumber++) {
            int i = banknotesNumber - 1;
            if (banknotes[i] == null || banknotes[i].getCount() <= 0) continue;
            System.out.println("[" + banknotesNumber + "] " + banknotes[i].getName() + " BYN");
        }
    }

    public static void promptSelectBanknotes() {
        System.out.println("Пожалуйста выберите сумму:");
    }

    public static int readBanknotesNumber() {
        Scanner scanner = new Scanner(System.in);
        String banknotesNumberPattern = "[1-5]";
        boolean isCorrectValue = false;
        int banknotesNumber = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(banknotesNumberPattern)) {
                isCorrectValue = true;
                banknotesNumber = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return banknotesNumber;
    }

}