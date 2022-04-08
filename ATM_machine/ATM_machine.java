package jc1_homework.ATM_machine;

import my.Version;

@Version(number = "2.0")
public class ATM_machine {

    private final UserDisplay userDisplay;
    private final Storage banknotesStorage;
    private final Account account;

    public ATM_machine() {
        this.userDisplay = new UserDisplay();
        this.banknotesStorage = new Storage();
        this.account = new Account();
    }

    public void work() {
        System.out.println("--------- Добро пожаловать в банкомат ---------");
        Account.user();
        UserDisplay.startMenu();
    }





}
